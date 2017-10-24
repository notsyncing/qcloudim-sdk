package io.github.notsyncing.qcloudim.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.util.Arrays;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.security.*;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class TlsSignature {
	public static class GenTLSSignatureResult
	{
		public String errMessage;
		public String urlSig;
		public int expireTime;
		public int initTime;
		public GenTLSSignatureResult()
		{
			errMessage = "";
			urlSig = "";
		}
	}

	public static class CheckTLSSignatureResult
	{
		public String errMessage;
		public boolean verifyResult;
		public int expireTime;
		public int initTime;
		public CheckTLSSignatureResult()
		{
			errMessage = "";
			verifyResult = false;
		}
	}

	/**
	 * @brief 生成 tls 票据，精简参数列表，有效期默认为 180 天
	 * @param sdkAppId 应用的 sdkappid
	 * @param identifier 用户 id
	 * @param privStr 私钥文件内容
	 * @return
	 * @throws IOException
	 */
	public static GenTLSSignatureResult genTLSSignatureEx(
			String sdkAppId,
			String identifier,
			String privStr) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
		return genTLSSignatureEx(sdkAppId, identifier, privStr, 3600*24*180);
	}

	/**
	 * @brief 生成 tls 票据，精简参数列表
	 * @param sdkAppId 应用的 sdkappid
	 * @param identifier 用户 id
	 * @param privStr 私钥文件内容
	 * @param expire 有效期，以秒为单位，推荐时长一个月
	 * @return
	 * @throws IOException
	 */
	public static GenTLSSignatureResult genTLSSignatureEx(
			String sdkAppId,
			String identifier,
			String privStr,
			long expire) throws IOException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {

		GenTLSSignatureResult result = new GenTLSSignatureResult();
		
        Security.addProvider(new BouncyCastleProvider());
        Reader reader = new CharArrayReader(privStr.toCharArray());
        JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
        PEMParser parser = new PEMParser(reader);
        Object obj = parser.readObject();
        parser.close();
    	PrivateKey privKeyStruct = converter.getPrivateKey((PrivateKeyInfo) obj);
		
		String jsonString = "{" 
		+ "\"TLS.account_type\":\"" + 0 +"\","
		+"\"TLS.identifier\":\"" + identifier +"\","
		+"\"TLS.appid_at_3rd\":\"" + 0 +"\","
	    +"\"TLS.sdk_appid\":\"" + sdkAppId +"\","
		+"\"TLS.expire_after\":\"" + expire +"\","
        +"\"TLS.version\": \"201512300000\""
		+"}";
		
		String time = String.valueOf(System.currentTimeMillis()/1000);
		String SerialString = 
			"TLS.appid_at_3rd:" + 0 + "\n" +
			"TLS.account_type:" + 0 + "\n" +
			"TLS.identifier:" + identifier + "\n" + 
			"TLS.sdk_appid:" + sdkAppId + "\n" +
			"TLS.time:" + time + "\n" +
			"TLS.expire_after:" + expire +"\n";

        //Create Signature by SerialString
        Signature signature = Signature.getInstance("SHA256withECDSA", "BC");
        signature.initSign(privKeyStruct);
        signature.update(SerialString.getBytes(Charset.forName("UTF-8")));
        byte[] signatureBytes = signature.sign();

        String sigTLS = java.util.Base64.getEncoder().encodeToString(signatureBytes);

        //Add TlsSig to jsonString
        JSONObject jsonObject= JSON.parseObject(jsonString);
        jsonObject.put("TLS.sig", sigTLS);
        jsonObject.put("TLS.time", time);
        jsonString = jsonObject.toString();

        //compression
        Deflater compresser = new Deflater();
        compresser.setInput(jsonString.getBytes(Charset.forName("UTF-8")));

        compresser.finish();
        byte [] compressBytes = new byte [512];
        int compressBytesLength = compresser.deflate(compressBytes);
        compresser.end();
        String userSig = java.util.Base64.getUrlEncoder()
                .encodeToString(Arrays.copyOfRange(compressBytes,0,compressBytesLength));

        result.urlSig = userSig;

		return result;
	}
	
	public static CheckTLSSignatureResult checkTLSSignatureEx(
			String urlSig,
			String sdkAppid,
			String identifier, 
			String publicKey ) throws DataFormatException, IOException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {

		CheckTLSSignatureResult result = new CheckTLSSignatureResult();	
        Security.addProvider(new BouncyCastleProvider());
		
		//DeBaseUrl64 urlSig to json

        byte[] compressBytes = java.util.Base64.getUrlDecoder().decode(urlSig.getBytes(Charset.forName("UTF-8")));
		
		//Decompression
		Inflater decompression =  new Inflater();
		decompression.setInput(compressBytes, 0, compressBytes.length);
		byte [] decompressBytes = new byte [1024];
		int decompressLength = decompression.inflate(decompressBytes);
		decompression.end();
		
		String jsonString = new String(Arrays.copyOfRange(decompressBytes, 0, decompressLength));
		
		//Get TLS.Sig from json
		JSONObject jsonObject= JSON.parseObject(jsonString);
		String sigTLS = jsonObject.getString("TLS.sig");
		
		//debase64 TLS.Sig to get serailString
        byte[] signatureBytes = java.util.Base64.getDecoder().decode(sigTLS.getBytes(Charset.forName("UTF-8")));

        String strSdkAppid = jsonObject.getString("TLS.sdk_appid");
        String sigTime = jsonObject.getString("TLS.time");
        String sigExpire = jsonObject.getString("TLS.expire_after");

        if (!sdkAppid.equals(strSdkAppid))
        {
            result.errMessage = new String(	"sdkappid "
                    + strSdkAppid
                    + " in tls sig not equal sdkappid "
                    + sdkAppid
                    + " in request");
            return result;
        }

        if ( System.currentTimeMillis()/1000 - Long.parseLong(sigTime) > Long.parseLong(sigExpire)) {
            result.errMessage = new String("TLS sig is out of date");
            return result;
        }

        //Get Serial String from json
        String SerialString =
            "TLS.appid_at_3rd:" + 0 + "\n" +
            "TLS.account_type:" + 0 + "\n" +
            "TLS.identifier:" + identifier + "\n" +
            "TLS.sdk_appid:" + sdkAppid + "\n" +
            "TLS.time:" + sigTime + "\n" +
            "TLS.expire_after:" + sigExpire + "\n";

        Reader reader = new CharArrayReader(publicKey.toCharArray());
        PEMParser  parser = new PEMParser(reader);
        JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
        Object obj = parser.readObject();
        parser.close();
        PublicKey pubKeyStruct  = converter.getPublicKey((SubjectPublicKeyInfo) obj);

        Signature signature = Signature.getInstance("SHA256withECDSA","BC");
        signature.initVerify(pubKeyStruct);
        signature.update(SerialString.getBytes(Charset.forName("UTF-8")));
        boolean bool = signature.verify(signatureBytes);
        result.expireTime = Integer.parseInt(sigExpire);
        result.initTime = Integer.parseInt(sigTime);
        result.verifyResult = bool;
		
		return result;
	}

}

package io.github.notsyncing.qclouldim.tests;

import io.github.notsyncing.qcloudim.utils.TlsSignature;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.util.zip.DataFormatException;

import static io.github.notsyncing.qcloudim.utils.TlsSignature.checkTLSSignatureEx;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TlsSignatureTest {
    @Test
    public void testSignature() throws DataFormatException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, SignatureException {
        //Use pemfile keys to test
        String privStr = "-----BEGIN PRIVATE KEY-----\n" +
                "MIGEAgEAMBAGByqGSM49AgEGBSuBBAAKBG0wawIBAQQgiBPYMVTjspLfqoq46oZd\n" +
                "j9A0C8p7aK3Fi6/4zLugCkehRANCAATU49QhsAEVfIVJUmB6SpUC6BPaku1g/dzn\n" +
                "0Nl7iIY7W7g2FoANWnoF51eEUb6lcZ3gzfgg8VFGTpJriwHQWf5T\n" +
                "-----END PRIVATE KEY-----";

        //change public pem string to public string
        String pubStr = "-----BEGIN PUBLIC KEY-----\n"+
                "MFYwEAYHKoZIzj0CAQYFK4EEAAoDQgAE1OPUIbABFXyFSVJgekqVAugT2pLtYP3c\n"+
                "59DZe4iGO1u4NhaADVp6BedXhFG+pXGd4M34IPFRRk6Sa4sB0Fn+Uw==\n"+
                "-----END PUBLIC KEY-----";

        // generate signature
        TlsSignature.GenTLSSignatureResult result = TlsSignature.genTLSSignatureEx("1400000955", "xiaojun", privStr);

        assertNotEquals(0, result.urlSig.length());

        System.out.println("---\ngenerate sig:\n" + result.urlSig + "\n---\n");

        // check signature
        TlsSignature.CheckTLSSignatureResult checkResult = checkTLSSignatureEx(result.urlSig, "1400000955", "xiaojun", pubStr);

        assertTrue(checkResult.verifyResult);

        System.out.println("\n---\ncheck sig ok -- expire time " + checkResult.expireTime + " -- init time " + checkResult.initTime + "\n---\n");
    }
}

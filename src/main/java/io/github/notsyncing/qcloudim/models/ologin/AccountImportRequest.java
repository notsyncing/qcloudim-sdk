package io.github.notsyncing.qcloudim.models.ologin;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class AccountImportRequest extends QCloudIMRequest {
    @JSONField(name = "Nick")
    private String nick;

    @JSONField(name = "FaceUrl")
    private String faceUrl;

    @JSONField(name = "Identifier")
    private String identifier;

    public AccountImportRequest(String requestIdentifier, String identifier, String nick, String faceUrl) {
        super(requestIdentifier);

        this.nick = nick;
        this.faceUrl = faceUrl;
        this.identifier = identifier;
    }

    public AccountImportRequest() {
        super();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

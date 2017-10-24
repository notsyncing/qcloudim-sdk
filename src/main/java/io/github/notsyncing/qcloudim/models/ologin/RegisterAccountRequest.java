package io.github.notsyncing.qcloudim.models.ologin;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class RegisterAccountRequest extends QCloudIMRequest {
    @JSONField(name = "Identifier")
    private String identifier;

    @JSONField(name = "IdentifierType")
    private int identifierType;

    @JSONField(name = "Password")
    private String password;

    public RegisterAccountRequest(String requestIdentifier, String identifier, int identifierType, String password) {
        super(requestIdentifier);

        this.identifier = identifier;
        this.identifierType = identifierType;
        this.password = password;
    }

    public RegisterAccountRequest() {
        super();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(int identifierType) {
        this.identifierType = identifierType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

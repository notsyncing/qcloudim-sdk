package io.github.notsyncing.qcloudim.models.ologin;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class KickRequest extends QCloudIMRequest {
    @JSONField(name = "Identifier")
    private String identifier;

    public KickRequest(String requestIdentifier, String identifier) {
        super(requestIdentifier);

        this.identifier = identifier;
    }

    public KickRequest() {
        super();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

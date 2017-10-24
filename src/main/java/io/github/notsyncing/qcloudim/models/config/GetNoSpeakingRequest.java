package io.github.notsyncing.qcloudim.models.config;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class GetNoSpeakingRequest extends QCloudIMRequest {
    @JSONField(name = "Get_Account")
    private String getAccount;

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }
}

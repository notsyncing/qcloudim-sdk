package io.github.notsyncing.qcloudim.models;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class QCloudIMRequest {
    @JSONField(serialize = false)
    private String reqIdentifier;

    @JSONField(name = "usersig", serialize = false)
    private String userSig;

    @JSONField(name = "sdkappid", serialize = false)
    private String appId;

    @JSONField(serialize = false)
    private String random;

    public QCloudIMRequest(String reqIdentifier) {
        this.reqIdentifier = reqIdentifier;
    }

    public QCloudIMRequest() {

    }

    public String getReqIdentifier() {
        return reqIdentifier;
    }

    public void setReqIdentifier(String reqIdentifier) {
        this.reqIdentifier = reqIdentifier;
    }

    public String getUserSig() {
        return userSig;
    }

    public void setUserSig(String userSig) {
        this.userSig = userSig;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}

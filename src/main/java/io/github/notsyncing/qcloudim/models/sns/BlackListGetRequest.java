package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class BlackListGetRequest extends QCloudIMRequest {
    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "StartIndex")
    private int startIndex;

    @JSONField(name = "MaxLimited")
    private int maxLimited;

    @JSONField(name = "LastSequence")
    private long lastSequence;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getMaxLimited() {
        return maxLimited;
    }

    public void setMaxLimited(int maxLimited) {
        this.maxLimited = maxLimited;
    }

    public long getLastSequence() {
        return lastSequence;
    }

    public void setLastSequence(long lastSequence) {
        this.lastSequence = lastSequence;
    }
}

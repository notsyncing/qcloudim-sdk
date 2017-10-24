package io.github.notsyncing.qcloudim.models.config;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

public class GetNoSpeakingResult extends QCloudIMResult {
    @JSONField(name = "C2CmsgNospeakingTime")
    private long c2cMsgNoSpeakingTime;

    @JSONField(name = "GroupmsgNospeakingTime")
    private long groupMsgNoSpeakingTime;

    public long getC2cMsgNoSpeakingTime() {
        return c2cMsgNoSpeakingTime;
    }

    public void setC2cMsgNoSpeakingTime(long c2cMsgNoSpeakingTime) {
        this.c2cMsgNoSpeakingTime = c2cMsgNoSpeakingTime;
    }

    public long getGroupMsgNoSpeakingTime() {
        return groupMsgNoSpeakingTime;
    }

    public void setGroupMsgNoSpeakingTime(long groupMsgNoSpeakingTime) {
        this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
    }
}

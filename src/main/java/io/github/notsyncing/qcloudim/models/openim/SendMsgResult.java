package io.github.notsyncing.qcloudim.models.openim;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

public class SendMsgResult extends QCloudIMResult {
    @JSONField(name = "MsgTime")
    private long msgTime;

    public SendMsgResult() {
        super();
    }

    public long getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(long msgTime) {
        this.msgTime = msgTime;
    }
}


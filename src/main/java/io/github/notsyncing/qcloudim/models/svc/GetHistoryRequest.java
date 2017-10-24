package io.github.notsyncing.qcloudim.models.svc;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class GetHistoryRequest extends QCloudIMRequest {
    @JSONField(name = "ChatType")
    private String chatType;

    @JSONField(name = "MsgTime")
    private long msgTime;

    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public long getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(long msgTime) {
        this.msgTime = msgTime;
    }
}

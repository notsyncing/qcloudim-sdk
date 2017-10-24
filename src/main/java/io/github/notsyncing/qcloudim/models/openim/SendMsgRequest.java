package io.github.notsyncing.qcloudim.models.openim;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.message.MsgBodyItem;
import io.github.notsyncing.qcloudim.models.message.OfflinePushInfo;

import java.util.List;

public class SendMsgRequest extends QCloudIMRequest {
    @JSONField(name = "SyncOtherMachine")
    private int syncOtherMachine;

    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "To_Account")
    private String toAccount;

    @JSONField(name = "MsgLifeTime")
    private int msgLifeTime;

    @JSONField(name = "MsgRandom")
    private int msgRandom;

    @JSONField(name = "MsgTimeStamp")
    private long msgTimestamp;

    @JSONField(name = "MsgBody")
    private List<MsgBodyItem> msgBody;

    @JSONField(name = "OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public SendMsgRequest() {
        super();
    }

    public int getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public void setSyncOtherMachine(int syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public int getMsgLifeTime() {
        return msgLifeTime;
    }

    public void setMsgLifeTime(int msgLifeTime) {
        this.msgLifeTime = msgLifeTime;
    }

    public int getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(int msgRandom) {
        this.msgRandom = msgRandom;
    }

    public long getMsgTimestamp() {
        return msgTimestamp;
    }

    public void setMsgTimestamp(long msgTimestamp) {
        this.msgTimestamp = msgTimestamp;
    }

    public List<MsgBodyItem> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBodyItem> msgBody) {
        this.msgBody = msgBody;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }
}

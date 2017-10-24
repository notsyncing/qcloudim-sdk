package io.github.notsyncing.qcloudim.models.openim;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.message.MsgBodyItem;

import java.util.List;

public class ImportMsgRequest extends QCloudIMRequest {
    @JSONField(name = "SyncFromOldSystem")
    private int syncFromOldSystem;

    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "To_Account")
    private String toAccount;

    @JSONField(name = "MsgRandom")
    private int msgRandom;

    @JSONField(name = "MsgTimestamp")
    private long msgTimestamp;

    @JSONField(name = "MsgBody")
    private List<MsgBodyItem> msgBody;

    public int getSyncFromOldSystem() {
        return syncFromOldSystem;
    }

    public void setSyncFromOldSystem(int syncFromOldSystem) {
        this.syncFromOldSystem = syncFromOldSystem;
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
}

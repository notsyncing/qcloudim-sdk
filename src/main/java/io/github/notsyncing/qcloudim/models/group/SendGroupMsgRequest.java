package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.message.MsgBodyItem;
import io.github.notsyncing.qcloudim.models.message.OfflinePushInfo;

import java.util.List;

public class SendGroupMsgRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "MsgPriority")
    private String msgPriority;

    @JSONField(name = "Random")
    private int msgRandom;

    @JSONField(name = "OnlineOnlyFlag")
    private int onlineOnlyFlag;

    @JSONField(name = "MsgBody")
    private List<MsgBodyItem> msgBody;

    @JSONField(name = "OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    @JSONField(name = "ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getMsgPriority() {
        return msgPriority;
    }

    public void setMsgPriority(String msgPriority) {
        this.msgPriority = msgPriority;
    }

    public int getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(int random) {
        this.msgRandom = random;
    }

    public int getOnlineOnlyFlag() {
        return onlineOnlyFlag;
    }

    public void setOnlineOnlyFlag(int onlineOnlyFlag) {
        this.onlineOnlyFlag = onlineOnlyFlag;
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

    public List<String> getForbidCallbackControl() {
        return forbidCallbackControl;
    }

    public void setForbidCallbackControl(List<String> forbidCallbackControl) {
        this.forbidCallbackControl = forbidCallbackControl;
    }
}

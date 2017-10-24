package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.message.MsgBodyItem;

import java.util.List;

public class ImportGroupMsgRequest extends QCloudIMRequest {
    public static class MsgListItem {
        @JSONField(name = "From_Account")
        private String fromAccount;

        @JSONField(name = "SendTime")
        private long sendTime;

        @JSONField(name = "Random")
        private int random;

        @JSONField(name = "MsgBody")
        private List<MsgBodyItem> msgBody;

        public String getFromAccount() {
            return fromAccount;
        }

        public void setFromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
        }

        public long getSendTime() {
            return sendTime;
        }

        public void setSendTime(long sendTime) {
            this.sendTime = sendTime;
        }

        public int getRandom() {
            return random;
        }

        public void setRandom(int random) {
            this.random = random;
        }

        public List<MsgBodyItem> getMsgBody() {
            return msgBody;
        }

        public void setMsgBody(List<MsgBodyItem> msgBody) {
            this.msgBody = msgBody;
        }
    }

    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "MsgList")
    private List<MsgListItem> msgList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<MsgListItem> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<MsgListItem> msgList) {
        this.msgList = msgList;
    }
}

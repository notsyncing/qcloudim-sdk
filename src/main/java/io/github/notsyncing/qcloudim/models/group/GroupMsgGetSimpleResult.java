package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.message.MsgBodyItem;

import java.util.List;

public class GroupMsgGetSimpleResult extends QCloudIMResult {
    public static class RspMsgItem {
        @JSONField(name = "From_Account")
        private String fromAccount;

        @JSONField(name = "IsPlaceMsg")
        private int isPlaceMsg;

        @JSONField(name = "MsgBody")
        private List<MsgBodyItem> msgBody;

        @JSONField(name = "MsgRandom")
        private int msgRandom;

        @JSONField(name = "MsgSeq")
        private long msgSeq;

        @JSONField(name = "MsgTimestamp")
        private long msgTimestamp;

        public String getFromAccount() {
            return fromAccount;
        }

        public void setFromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
        }

        public int getIsPlaceMsg() {
            return isPlaceMsg;
        }

        public void setIsPlaceMsg(int isPlaceMsg) {
            this.isPlaceMsg = isPlaceMsg;
        }

        public List<MsgBodyItem> getMsgBody() {
            return msgBody;
        }

        public void setMsgBody(List<MsgBodyItem> msgBody) {
            this.msgBody = msgBody;
        }

        public int getMsgRandom() {
            return msgRandom;
        }

        public void setMsgRandom(int msgRandom) {
            this.msgRandom = msgRandom;
        }

        public long getMsgSeq() {
            return msgSeq;
        }

        public void setMsgSeq(long msgSeq) {
            this.msgSeq = msgSeq;
        }

        public long getMsgTimestamp() {
            return msgTimestamp;
        }

        public void setMsgTimestamp(long msgTimestamp) {
            this.msgTimestamp = msgTimestamp;
        }
    }

    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "IsFinished")
    private int isFinished;

    @JSONField(name = "RspMsgList")
    private List<RspMsgItem> rspMsgList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(int isFinished) {
        this.isFinished = isFinished;
    }

    public List<RspMsgItem> getRspMsgList() {
        return rspMsgList;
    }

    public void setRspMsgList(List<RspMsgItem> rspMsgList) {
        this.rspMsgList = rspMsgList;
    }
}

package io.github.notsyncing.qcloudim.models.member;

import com.alibaba.fastjson.annotation.JSONField;

public class MemberListResultItem extends MemberListItem {
    @JSONField(name = "Member_Account")
    private String memberAccount;

    @JSONField(name = "JoinTime")
    private long joinTime;

    @JSONField(name = "MsgSeq")
    private long msgSeq;

    @JSONField(name = "MsgFlag")
    private String msgFlag;

    @JSONField(name = "LastSendMsgTime")
    private long lastSendMsgTime;

    @JSONField(name = "ShutUpUntil")
    private long shutUpUntil;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(long joinTime) {
        this.joinTime = joinTime;
    }

    public long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    public long getLastSendMsgTime() {
        return lastSendMsgTime;
    }

    public void setLastSendMsgTime(long lastSendMsgTime) {
        this.lastSendMsgTime = lastSendMsgTime;
    }

    public long getShutUpUntil() {
        return shutUpUntil;
    }

    public void setShutUpUntil(long shutUpUntil) {
        this.shutUpUntil = shutUpUntil;
    }
}

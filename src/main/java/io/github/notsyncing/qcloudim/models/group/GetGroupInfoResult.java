package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.member.AppDefinedData;
import io.github.notsyncing.qcloudim.models.member.MemberListItem;

import java.util.List;

public class GetGroupInfoResult extends QCloudIMResult {
    public static class GroupInfo {
        @JSONField(name = "GroupId")
        private String groupId;

        @JSONField(name = "ErrorCode")
        private int errorCode;

        @JSONField(name = "ErrorInfo")
        private String errorInfo;

        @JSONField(name = "Type")
        private String type;

        @JSONField(name = "Name")
        private String name;

        @JSONField(name = "Introduction")
        private String introduction;

        @JSONField(name = "Notification")
        private String notification;

        @JSONField(name = "FaceUrl")
        private String faceUrl;

        @JSONField(name = "Owner_Account")
        private String ownerAccount;

        @JSONField(name = "CreateTime")
        private long createTime;

        @JSONField(name = "LastInfoTime")
        private long lastInfoTime;

        @JSONField(name = "LastMsgTime")
        private long lastMsgTime;

        @JSONField(name = "NextMsgSeq")
        private long nextMsgSeq;

        @JSONField(name = "MemberNum")
        private int memberNum;

        @JSONField(name = "MaxMemberNum")
        private int maxMemberNum;

        @JSONField(name = "ApplyJoinOption")
        private String applyJoinOption;

        @JSONField(name = "AppDefinedData")
        private List<AppDefinedData> appDefinedData;

        @JSONField(name = "MemberList")
        private List<MemberListItem> memberList;

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorInfo() {
            return errorInfo;
        }

        public void setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getNotification() {
            return notification;
        }

        public void setNotification(String notification) {
            this.notification = notification;
        }

        public String getFaceUrl() {
            return faceUrl;
        }

        public void setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
        }

        public String getOwnerAccount() {
            return ownerAccount;
        }

        public void setOwnerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getLastInfoTime() {
            return lastInfoTime;
        }

        public void setLastInfoTime(long lastInfoTime) {
            this.lastInfoTime = lastInfoTime;
        }

        public long getLastMsgTime() {
            return lastMsgTime;
        }

        public void setLastMsgTime(long lastMsgTime) {
            this.lastMsgTime = lastMsgTime;
        }

        public long getNextMsgSeq() {
            return nextMsgSeq;
        }

        public void setNextMsgSeq(long nextMsgSeq) {
            this.nextMsgSeq = nextMsgSeq;
        }

        public int getMemberNum() {
            return memberNum;
        }

        public void setMemberNum(int memberNum) {
            this.memberNum = memberNum;
        }

        public int getMaxMemberNum() {
            return maxMemberNum;
        }

        public void setMaxMemberNum(int maxMemberNum) {
            this.maxMemberNum = maxMemberNum;
        }

        public String getApplyJoinOption() {
            return applyJoinOption;
        }

        public void setApplyJoinOption(String applyJoinOption) {
            this.applyJoinOption = applyJoinOption;
        }

        public List<AppDefinedData> getAppDefinedData() {
            return appDefinedData;
        }

        public void setAppDefinedData(List<AppDefinedData> appDefinedData) {
            this.appDefinedData = appDefinedData;
        }

        public List<MemberListItem> getMemberList() {
            return memberList;
        }

        public void setMemberList(List<MemberListItem> memberList) {
            this.memberList = memberList;
        }
    }

    @JSONField(name = "GroupInfo")
    private List<GroupInfo> groupInfo;

    public List<GroupInfo> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfo> groupInfo) {
        this.groupInfo = groupInfo;
    }
}

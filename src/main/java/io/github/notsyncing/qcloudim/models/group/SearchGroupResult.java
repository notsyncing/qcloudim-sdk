package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class SearchGroupResult extends QCloudIMResult {
    public static class GroupInfo {
        @JSONField(name = "ApplyJoinOption")
        private String applyJoinOption;

        @JSONField(name = "CreateTime")
        private long createTime;

        @JSONField(name = "ErrorCode")
        private int errorCode;

        @JSONField(name = "FaceUrl")
        private String faceUrl;

        @JSONField(name = "GroupId")
        private String groupId;

        @JSONField(name = "Introduction")
        private String introduction;

        @JSONField(name = "MaxMemberNum")
        private int maxMemberNum;

        @JSONField(name = "MemberNum")
        private int memberNum;

        @JSONField(name = "Name")
        private String name;

        @JSONField(name = "OnlineMemberNum")
        private int onlineMemberNum;

        @JSONField(name = "Owner_Account")
        private String ownerAccount;

        @JSONField(name = "Type")
        private String type;

        public String getApplyJoinOption() {
            return applyJoinOption;
        }

        public void setApplyJoinOption(String applyJoinOption) {
            this.applyJoinOption = applyJoinOption;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public String getFaceUrl() {
            return faceUrl;
        }

        public void setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public int getMaxMemberNum() {
            return maxMemberNum;
        }

        public void setMaxMemberNum(int maxMemberNum) {
            this.maxMemberNum = maxMemberNum;
        }

        public int getMemberNum() {
            return memberNum;
        }

        public void setMemberNum(int memberNum) {
            this.memberNum = memberNum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOnlineMemberNum() {
            return onlineMemberNum;
        }

        public void setOnlineMemberNum(int onlineMemberNum) {
            this.onlineMemberNum = onlineMemberNum;
        }

        public String getOwnerAccount() {
            return ownerAccount;
        }

        public void setOwnerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    @JSONField(name = "GroupInfo")
    private List<GroupInfo> groupInfo;

    @JSONField(name = "TotalRecord")
    private int totalRecord;

    public List<GroupInfo> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfo> groupInfo) {
        this.groupInfo = groupInfo;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }
}

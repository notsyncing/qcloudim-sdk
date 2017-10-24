package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class ImportGroupMemberRequest extends QCloudIMRequest {
    public static class MemberItem {
        @JSONField(name = "MemberAccount")
        private String memberAccount;

        @JSONField(name = "Role")
        private String role;

        @JSONField(name = "JoinTime")
        private long joinTime;

        @JSONField(name = "UnreadMsgNum")
        private int unreadMsgNum;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public long getJoinTime() {
            return joinTime;
        }

        public void setJoinTime(long joinTime) {
            this.joinTime = joinTime;
        }

        public int getUnreadMsgNum() {
            return unreadMsgNum;
        }

        public void setUnreadMsgNum(int unreadMsgNum) {
            this.unreadMsgNum = unreadMsgNum;
        }
    }

    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "MemberList")
    private List<MemberItem> memberList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<MemberItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberItem> memberList) {
        this.memberList = memberList;
    }
}

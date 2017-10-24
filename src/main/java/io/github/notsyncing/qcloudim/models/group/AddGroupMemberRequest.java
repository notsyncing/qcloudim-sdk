package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class AddGroupMemberRequest extends QCloudIMRequest {
    public static class MemberListItem {
        @JSONField(name = "Member_Account")
        private String memberAccount;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }
    }

    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Silence")
    private int silence;

    @JSONField(name = "MemberList")
    private List<MemberListItem> memberList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSilence() {
        return silence;
    }

    public void setSilence(int silence) {
        this.silence = silence;
    }

    public List<MemberListItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberListItem> memberList) {
        this.memberList = memberList;
    }
}


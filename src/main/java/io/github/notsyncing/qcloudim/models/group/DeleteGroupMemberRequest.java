package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class DeleteGroupMemberRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Silence")
    private int silence;

    @JSONField(name = "Reason")
    private String reason;

    @JSONField(name = "MemberToDel_Account")
    private List<String> memberToDelAccount;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<String> getMemberToDelAccount() {
        return memberToDelAccount;
    }

    public void setMemberToDelAccount(List<String> memberToDelAccount) {
        this.memberToDelAccount = memberToDelAccount;
    }
}

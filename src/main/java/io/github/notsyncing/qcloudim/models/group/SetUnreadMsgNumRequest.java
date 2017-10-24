package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

public class SetUnreadMsgNumRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Member_Account")
    private String memberAccount;

    @JSONField(name = "UnreadMsgNum")
    private int unreadMsgNum;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public int getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(int unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }
}

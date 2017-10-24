package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class ForbidSendMsgRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Members_Account")
    private List<String> memberAccount;

    @JSONField(name = "ShutUpTime")
    private int shutUpTime;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(List<String> memberAccount) {
        this.memberAccount = memberAccount;
    }

    public int getShutUpTime() {
        return shutUpTime;
    }

    public void setShutUpTime(int shutUpTime) {
        this.shutUpTime = shutUpTime;
    }
}

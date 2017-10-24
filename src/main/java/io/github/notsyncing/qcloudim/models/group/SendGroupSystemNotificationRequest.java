package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class SendGroupSystemNotificationRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Content")
    private String content;

    @JSONField(name = "ToMembers_Account")
    private List<String> toMemberAccount;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getToMemberAccount() {
        return toMemberAccount;
    }

    public void setToMemberAccount(List<String> toMemberAccount) {
        this.toMemberAccount = toMemberAccount;
    }
}

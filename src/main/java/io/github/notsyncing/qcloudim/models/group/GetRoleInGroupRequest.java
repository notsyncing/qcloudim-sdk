package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class GetRoleInGroupRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "User_Account")
    private List<String> userAccount;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(List<String> userAccount) {
        this.userAccount = userAccount;
    }
}

package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

public class ChangeGroupOwnerRequest extends QCloudIMResult {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "NewOwner_Account")
    private String newOwnerAccount;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getNewOwnerAccount() {
        return newOwnerAccount;
    }

    public void setNewOwnerAccount(String newOwnerAccount) {
        this.newOwnerAccount = newOwnerAccount;
    }
}

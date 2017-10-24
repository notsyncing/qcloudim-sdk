package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class GroupDeleteRequest extends QCloudIMRequest {
    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "GroupName")
    private List<String> groupName;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }
}

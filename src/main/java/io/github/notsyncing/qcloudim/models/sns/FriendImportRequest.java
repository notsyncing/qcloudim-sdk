package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.friend.AddFriendItem;

import java.util.List;

public class FriendImportRequest extends QCloudIMRequest {
    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "AddFriendItem")
    private List<AddFriendItem> addFriendItem;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<AddFriendItem> getAddFriendItem() {
        return addFriendItem;
    }

    public void setAddFriendItem(List<AddFriendItem> addFriendItem) {
        this.addFriendItem = addFriendItem;
    }
}

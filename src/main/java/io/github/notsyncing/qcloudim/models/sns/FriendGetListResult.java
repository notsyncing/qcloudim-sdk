package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.friend.InfoItem;

import java.util.List;

public class FriendGetListResult extends QCloudIMResult {
    @JSONField(name = "InfoItem")
    private List<InfoItem> infoItem;

    @JSONField(name = "Fail_Account")
    private List<String> failAccount;

    @JSONField(name = "Invalid_Account")
    private List<String> invalidAccount;

    public List<InfoItem> getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(List<InfoItem> infoItem) {
        this.infoItem = infoItem;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    public List<String> getInvalidAccount() {
        return invalidAccount;
    }

    public void setInvalidAccount(List<String> invalidAccount) {
        this.invalidAccount = invalidAccount;
    }
}

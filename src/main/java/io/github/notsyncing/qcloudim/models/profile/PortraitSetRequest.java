package io.github.notsyncing.qcloudim.models.profile;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.portrait.ProfileItem;

import java.util.List;

public class PortraitSetRequest extends QCloudIMRequest {
    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "ProfileItem")
    private List<ProfileItem> tagList;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<ProfileItem> getTagList() {
        return tagList;
    }

    public void setTagList(List<ProfileItem> tagList) {
        this.tagList = tagList;
    }
}

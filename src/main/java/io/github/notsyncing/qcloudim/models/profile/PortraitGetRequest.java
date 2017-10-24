package io.github.notsyncing.qcloudim.models.profile;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class PortraitGetRequest extends QCloudIMRequest {
    @JSONField(name = "To_Account")
    private List<String> toAccount;

    @JSONField(name = "TagList")
    private List<String> tagList;

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
}

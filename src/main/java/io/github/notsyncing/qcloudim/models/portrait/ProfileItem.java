package io.github.notsyncing.qcloudim.models.portrait;

import com.alibaba.fastjson.annotation.JSONField;

public class ProfileItem {
    @JSONField(name = "Tag")
    private String tag;

    @JSONField(name = "Value")
    private String value;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

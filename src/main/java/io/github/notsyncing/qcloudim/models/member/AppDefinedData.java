package io.github.notsyncing.qcloudim.models.member;

import com.alibaba.fastjson.annotation.JSONField;

public class AppDefinedData {
    @JSONField(name = "Key")
    private String key;

    @JSONField(name = "Value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

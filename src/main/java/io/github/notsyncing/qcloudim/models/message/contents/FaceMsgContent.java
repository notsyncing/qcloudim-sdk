package io.github.notsyncing.qcloudim.models.message.contents;

import com.alibaba.fastjson.annotation.JSONField;

public class FaceMsgContent extends MsgContent {
    @JSONField(name = "Index")
    private int index;

    @JSONField(name = "Data")
    private String data;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

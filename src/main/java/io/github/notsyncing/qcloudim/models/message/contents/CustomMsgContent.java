package io.github.notsyncing.qcloudim.models.message.contents;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomMsgContent extends MsgContent {
    @JSONField(name = "Data")
    private String data;

    @JSONField(name = "Desc")
    private String desc;

    @JSONField(name = "Ext")
    private String ext;

    @JSONField(name = "Sound")
    private String sound;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

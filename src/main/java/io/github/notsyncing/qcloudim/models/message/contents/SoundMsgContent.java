package io.github.notsyncing.qcloudim.models.message.contents;

import com.alibaba.fastjson.annotation.JSONField;

public class SoundMsgContent extends MsgContent {
    @JSONField(name = "UUID")
    private String uuid;

    @JSONField(name = "Size")
    private long size;

    @JSONField(name = "Second")
    private int seconds;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}

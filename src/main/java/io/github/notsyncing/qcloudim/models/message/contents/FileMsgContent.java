package io.github.notsyncing.qcloudim.models.message.contents;

import com.alibaba.fastjson.annotation.JSONField;

public class FileMsgContent extends MsgContent {
    @JSONField(name = "UUID")
    private String uuid;

    @JSONField(name = "FileSize")
    private long fileSize;

    @JSONField(name = "FileName")
    private String filename;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

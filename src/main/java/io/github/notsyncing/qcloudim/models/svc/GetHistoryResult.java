package io.github.notsyncing.qcloudim.models.svc;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class GetHistoryResult extends QCloudIMResult {
    public static class FileItem {
        @JSONField(name = "URL")
        private String url;

        @JSONField(name = "ExpireTime")
        private String expireTime;

        @JSONField(name = "FileSize")
        private long fileSize;

        @JSONField(name = "FileMD5")
        private String fileMd5;

        @JSONField(name = "GzipSize")
        private long gzipSize;

        @JSONField(name = "GzipMD5")
        private String gzipMd5;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public long getFileSize() {
            return fileSize;
        }

        public void setFileSize(long fileSize) {
            this.fileSize = fileSize;
        }

        public String getFileMd5() {
            return fileMd5;
        }

        public void setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
        }

        public long getGzipSize() {
            return gzipSize;
        }

        public void setGzipSize(long gzipSize) {
            this.gzipSize = gzipSize;
        }

        public String getGzipMd5() {
            return gzipMd5;
        }

        public void setGzipMd5(String gzipMd5) {
            this.gzipMd5 = gzipMd5;
        }
    }

    @JSONField(name = "File")
    private List<FileItem> files;

    public List<FileItem> getFiles() {
        return files;
    }

    public void setFiles(List<FileItem> files) {
        this.files = files;
    }
}

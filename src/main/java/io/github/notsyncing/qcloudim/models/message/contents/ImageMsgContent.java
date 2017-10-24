package io.github.notsyncing.qcloudim.models.message.contents;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class ImageMsgContent extends MsgContent {
    public static class ImageInfo {
        @JSONField(name = "Type")
        private int type;

        @JSONField(name = "Size")
        private long size;

        @JSONField(name = "Width")
        private int width;

        @JSONField(name = "Height")
        private int height;

        @JSONField(name = "URL")
        private String url;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    @JSONField(name = "UUID")
    private String uuid;

    @JSONField(name = "ImageFormat")
    private int imageFormat;

    @JSONField(name = "ImageInfoArray")
    private List<ImageInfo> imageInfoArray;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(int imageFormat) {
        this.imageFormat = imageFormat;
    }

    public List<ImageInfo> getImageInfoArray() {
        return imageInfoArray;
    }

    public void setImageInfoArray(List<ImageInfo> imageInfoArray) {
        this.imageInfoArray = imageInfoArray;
    }
}

package io.github.notsyncing.qcloudim.models.message;

import com.alibaba.fastjson.annotation.JSONField;

public class OfflinePushInfo {
    public static class AndroidInfo {
        @JSONField(name = "Sound")
        private String sound;

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }
    }

    public static class ApnsInfo {
        @JSONField(name = "Sound")
        private String sound;

        @JSONField(name = "BadgeMode")
        private int badgeMode;
    }

    @JSONField(name = "PushFlag")
    private int pushFlag;

    @JSONField(name = "Desc")
    private String desc;

    @JSONField(name = "Ext")
    private String ext;

    @JSONField(name = "AndroidInfo")
    private AndroidInfo androidInfo;

    @JSONField(name = "ApnsInfo")
    private ApnsInfo apnsInfo;

    public int getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(int pushFlag) {
        this.pushFlag = pushFlag;
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

    public AndroidInfo getAndroidInfo() {
        return androidInfo;
    }

    public void setAndroidInfo(AndroidInfo androidInfo) {
        this.androidInfo = androidInfo;
    }

    public ApnsInfo getApnsInfo() {
        return apnsInfo;
    }

    public void setApnsInfo(ApnsInfo apnsInfo) {
        this.apnsInfo = apnsInfo;
    }
}

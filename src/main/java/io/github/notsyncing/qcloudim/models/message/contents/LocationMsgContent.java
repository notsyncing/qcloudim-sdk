package io.github.notsyncing.qcloudim.models.message.contents;

import com.alibaba.fastjson.annotation.JSONField;

public class LocationMsgContent extends MsgContent {
    @JSONField(name = "Desc")
    private String desc;

    @JSONField(name = "Latitude")
    private double latitude;

    @JSONField(name = "Longitude")
    private double longitude;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

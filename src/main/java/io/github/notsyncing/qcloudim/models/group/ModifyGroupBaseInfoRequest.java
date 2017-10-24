package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.member.AppDefinedData;

import java.util.List;

public class ModifyGroupBaseInfoRequest extends QCloudIMRequest {
    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Introduction")
    private String introduction;

    @JSONField(name = "Notification")
    private String notification;

    @JSONField(name = "FaceUrl")
    private String faceUrl;

    @JSONField(name = "MaxMemberNum")
    private int maxMemberCount;

    @JSONField(name = "ApplyJoinOption")
    private String applyJoinOption;

    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "AppDefinedData")
    private List<AppDefinedData> appDefinedData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public int getMaxMemberCount() {
        return maxMemberCount;
    }

    public void setMaxMemberCount(int maxMemberCount) {
        this.maxMemberCount = maxMemberCount;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<AppDefinedData> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }
}

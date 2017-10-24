package io.github.notsyncing.qcloudim.models.member;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class MemberListItem {
    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Role")
    private String role;

    @JSONField(name = "AppMemberDefinedData")
    private List<AppDefinedData> appMemberDefinedData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<AppDefinedData> getAppMemberDefinedData() {
        return appMemberDefinedData;
    }

    public void setAppMemberDefinedData(List<AppDefinedData> appMemberDefinedData) {
        this.appMemberDefinedData = appMemberDefinedData;
    }
}

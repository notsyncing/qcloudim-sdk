package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.member.AppDefinedData;

import java.util.List;

public class ModifyGroupMemberInfoRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Member_Account")
    private String memberAccount;

    @JSONField(name = "Role")
    private String role;

    @JSONField(name = "MsgFlag")
    private String msgFlag;

    @JSONField(name = "NameCard")
    private String nameCard;

    @JSONField(name = "AppMemberDefinedData")
    private List<AppDefinedData> appDefinedData;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public List<AppDefinedData> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }
}

package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class GetGroupMemberInfoRequest extends QCloudIMRequest {
    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "Limit")
    private Long limit;

    @JSONField(name = "Offset")
    private Long offset;

    @JSONField(name = "MemberInfoFilter")
    private List<String> memberInfoFilter;

    @JSONField(name = "MemberRoleFilter")
    private List<String> memberRoleFilter;

    @JSONField(name = "AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterForGroupMember;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public List<String> getMemberInfoFilter() {
        return memberInfoFilter;
    }

    public void setMemberInfoFilter(List<String> memberInfoFilter) {
        this.memberInfoFilter = memberInfoFilter;
    }

    public List<String> getMemberRoleFilter() {
        return memberRoleFilter;
    }

    public void setMemberRoleFilter(List<String> memberRoleFilter) {
        this.memberRoleFilter = memberRoleFilter;
    }

    public List<String> getAppDefinedDataFilterForGroupMember() {
        return appDefinedDataFilterForGroupMember;
    }

    public void setAppDefinedDataFilterForGroupMember(List<String> appDefinedDataFilterForGroupMember) {
        this.appDefinedDataFilterForGroupMember = appDefinedDataFilterForGroupMember;
    }
}

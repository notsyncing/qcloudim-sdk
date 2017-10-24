package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class GetGroupInfoRequest extends QCloudIMRequest {
    public static class ResponseFilter {
        @JSONField(name = "GroupBaseInfoFilter")
        private List<String> groupBaseInfoFilter;

        @JSONField(name = "MemberInfoFilter")
        private List<String> memberInfoFilter;

        @JSONField(name = "AppDefinedDataFilter_Group")
        private List<String> appDefinedDataFilterForGroup;

        @JSONField(name = "AppDefinedDataFilter_GroupMember")
        private List<String> appDefinedDataFilterForGroupMember;

        public List<String> getGroupBaseInfoFilter() {
            return groupBaseInfoFilter;
        }

        public void setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
            this.groupBaseInfoFilter = groupBaseInfoFilter;
        }

        public List<String> getMemberInfoFilter() {
            return memberInfoFilter;
        }

        public void setMemberInfoFilter(List<String> memberInfoFilter) {
            this.memberInfoFilter = memberInfoFilter;
        }

        public List<String> getAppDefinedDataFilterForGroup() {
            return appDefinedDataFilterForGroup;
        }

        public void setAppDefinedDataFilterForGroup(List<String> appDefinedDataFilterForGroup) {
            this.appDefinedDataFilterForGroup = appDefinedDataFilterForGroup;
        }

        public List<String> getAppDefinedDataFilterForGroupMember() {
            return appDefinedDataFilterForGroupMember;
        }

        public void setAppDefinedDataFilterForGroupMember(List<String> appDefinedDataFilterForGroupMember) {
            this.appDefinedDataFilterForGroupMember = appDefinedDataFilterForGroupMember;
        }
    }

    @JSONField(name = "GroupIdList")
    private List<String> groupIdList;

    @JSONField(name = "ResponseFilter")
    private ResponseFilter responseFilter;

    public List<String> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }
}

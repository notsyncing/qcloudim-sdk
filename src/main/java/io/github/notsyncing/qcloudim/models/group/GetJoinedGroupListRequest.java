package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class GetJoinedGroupListRequest extends QCloudIMRequest {
    public static class ResponseFilter {
        @JSONField(name = "GroupBaseInfoFilter")
        private List<String> groupBaseInfoFilter;

        @JSONField(name = "SelfInfoFilter")
        private List<String> selfInfoFilter;

        public List<String> getGroupBaseInfoFilter() {
            return groupBaseInfoFilter;
        }

        public void setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
            this.groupBaseInfoFilter = groupBaseInfoFilter;
        }

        public List<String> getSelfInfoFilter() {
            return selfInfoFilter;
        }

        public void setSelfInfoFilter(List<String> selfInfoFilter) {
            this.selfInfoFilter = selfInfoFilter;
        }
    }

    @JSONField(name = "Member_Account")
    private String memberAccount;

    @JSONField(name = "Limit")
    private Long limit;

    @JSONField(name = "Offset")
    private Long offset;

    @JSONField(name = "GroupType")
    private String groupType;

    @JSONField(name = "ResponseFilter")
    private ResponseFilter responseFilter;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
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

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }
}

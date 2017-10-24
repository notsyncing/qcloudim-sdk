package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class GetGroupShuttedUinResult extends QCloudIMResult {
    public static class ShuttedUinItem {
        @JSONField(name = "Member_Account")
        private String memberAccount;

        @JSONField(name = "ShuttedUntil")
        private long shuttedUntil;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }

        public long getShuttedUntil() {
            return shuttedUntil;
        }

        public void setShuttedUntil(long shuttedUntil) {
            this.shuttedUntil = shuttedUntil;
        }
    }

    @JSONField(name = "GroupId")
    private String groupId;

    @JSONField(name = "ShuttedUinList")
    private List<ShuttedUinItem> shuttedUinList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<ShuttedUinItem> getShuttedUinList() {
        return shuttedUinList;
    }

    public void setShuttedUinList(List<ShuttedUinItem> shuttedUinList) {
        this.shuttedUinList = shuttedUinList;
    }
}

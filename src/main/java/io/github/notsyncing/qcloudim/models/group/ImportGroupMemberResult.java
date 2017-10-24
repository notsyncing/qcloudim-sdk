package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class ImportGroupMemberResult extends QCloudIMResult {
    public static class MemberListItem {
        @JSONField(name = "Member_Account")
        private String memberAccount;

        @JSONField(name = "Result")
        private int result;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
    }

    @JSONField(name = "MemberList")
    private List<MemberListItem> memberList;

    public List<MemberListItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberListItem> memberList) {
        this.memberList = memberList;
    }
}

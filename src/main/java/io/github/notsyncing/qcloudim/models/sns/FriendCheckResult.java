package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class FriendCheckResult extends QCloudIMResult {
    public static class CheckItem {
        @JSONField(name = "To_Account")
        private String toAccount;

        @JSONField(name = "Relation")
        private String relation;

        @JSONField(name = "ResultCode")
        private int resultCode;

        @JSONField(name = "ResultInfo")
        private String resultInfo;

        public String getToAccount() {
            return toAccount;
        }

        public void setToAccount(String toAccount) {
            this.toAccount = toAccount;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }

        public int getResultCode() {
            return resultCode;
        }

        public void setResultCode(int resultCode) {
            this.resultCode = resultCode;
        }

        public String getResultInfo() {
            return resultInfo;
        }

        public void setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
        }
    }

    @JSONField(name = "CheckItem")
    private List<CheckItem> checkItem;

    @JSONField(name = "Fail_Account")
    private List<String> failAccount;

    @JSONField(name = "Invalid_Account")
    private List<String> invalidAccount;

    public List<CheckItem> getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(List<CheckItem> checkItem) {
        this.checkItem = checkItem;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    public List<String> getInvalidAccount() {
        return invalidAccount;
    }

    public void setInvalidAccount(List<String> invalidAccount) {
        this.invalidAccount = invalidAccount;
    }
}

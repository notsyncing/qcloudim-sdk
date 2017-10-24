package io.github.notsyncing.qcloudim.models.profile;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.portrait.ProfileItem;

import java.util.List;

public class PortraitGetResult extends QCloudIMResult {
    public static class UserProfileItem {
        @JSONField(name = "To_Account")
        private String toAccount;

        @JSONField(name = "ProfileItem")
        private List<ProfileItem> profileItem;

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

        public List<ProfileItem> getProfileItem() {
            return profileItem;
        }

        public void setProfileItem(List<ProfileItem> profileItem) {
            this.profileItem = profileItem;
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

    @JSONField(name = "UserProfileItem")
    private List<UserProfileItem> userProfileItem;

    @JSONField(name = "Fail_Account")
    private List<String> failAccount;

    @JSONField(name = "Invalid_Account")
    private List<String> invalidAccount;

    public List<UserProfileItem> getUserProfileItem() {
        return userProfileItem;
    }

    public void setUserProfileItem(List<UserProfileItem> userProfileItem) {
        this.userProfileItem = userProfileItem;
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

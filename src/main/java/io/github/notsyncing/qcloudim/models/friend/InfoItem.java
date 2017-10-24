package io.github.notsyncing.qcloudim.models.friend;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class InfoItem {
    public static class SnsProfileItem {
        @JSONField(name = "Tag")
        private String tag;

        @JSONField(name = "Value")
        private String value;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @JSONField(name = "Info_Account")
    private String infoAccount;

    @JSONField(name = "SnsProfileItem")
    private List<SnsProfileItem> snsProfileItem;

    public String getInfoAccount() {
        return infoAccount;
    }

    public void setInfoAccount(String infoAccount) {
        this.infoAccount = infoAccount;
    }

    public List<SnsProfileItem> getSnsProfileItem() {
        return snsProfileItem;
    }

    public void setSnsProfileItem(List<SnsProfileItem> snsProfileItem) {
        this.snsProfileItem = snsProfileItem;
    }
}

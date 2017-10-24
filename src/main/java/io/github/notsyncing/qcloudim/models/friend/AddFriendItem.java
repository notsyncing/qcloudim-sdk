package io.github.notsyncing.qcloudim.models.friend;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class AddFriendItem {
    public static class CustomItem {
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

    @JSONField(name = "To_Account")
    private String toAccount;

    @JSONField(name = "AddSource")
    private String addSource;

    @JSONField(name = "Remark")
    private String remark;

    @JSONField(name = "GroupName")
    private List<String> groupName;

    @JSONField(name = "AddWording")
    private String addWording;

    @JSONField(name = "AddTime")
    private Long addTime;

    @JSONField(name = "CustomItem")
    private List<CustomItem> customItem;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getAddSource() {
        return addSource;
    }

    public void setAddSource(String addSource) {
        this.addSource = addSource;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }

    public String getAddWording() {
        return addWording;
    }

    public void setAddWording(String addWording) {
        this.addWording = addWording;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}

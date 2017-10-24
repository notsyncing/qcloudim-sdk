package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

public class ImportGroupResult extends QCloudIMResult {
    @JSONField(name = "GroupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}

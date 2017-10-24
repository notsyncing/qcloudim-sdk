package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.member.GroupId;

import java.util.List;

public class GetGroupListResult extends QCloudIMResult {
    @JSONField(name = "TotalCount")
    private long totalCount;

    @JSONField(name = "GroupIdList")
    private List<GroupId> groupIdList;

    @JSONField(name = "Next")
    private long next;
}

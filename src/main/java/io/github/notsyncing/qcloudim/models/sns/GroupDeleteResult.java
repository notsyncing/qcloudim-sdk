package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

public class GroupDeleteResult extends QCloudIMResult {
    @JSONField(name = "CurrentSequence")
    private int currentSequence;

    public int getCurrentSequence() {
        return currentSequence;
    }

    public void setCurrentSequence(int currentSequence) {
        this.currentSequence = currentSequence;
    }
}

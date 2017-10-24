package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class FriendGetAllRequest extends QCloudIMRequest {
    @JSONField(name = "From_Account")
    private String fromAccount;

    @JSONField(name = "TimeStamp")
    private long timestamp;

    @JSONField(name = "StartIndex")
    private int startIndex;

    @JSONField(name = "TagList")
    private List<String> tagList;

    @JSONField(name = "LastStandardSequence")
    private int lastStandardSequence;

    @JSONField(name = "GetCount")
    private int count;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public int getLastStandardSequence() {
        return lastStandardSequence;
    }

    public void setLastStandardSequence(int lastStandardSequence) {
        this.lastStandardSequence = lastStandardSequence;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

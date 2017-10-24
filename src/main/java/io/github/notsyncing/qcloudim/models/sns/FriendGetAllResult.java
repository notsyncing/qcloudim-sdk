package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.friend.InfoItem;

import java.util.List;

public class FriendGetAllResult extends QCloudIMResult {
    @JSONField(name = "NeedUpdateAll")
    private String needUpdateAll;

    @JSONField(name = "TimeStampNow")
    private long timestampNow;

    @JSONField(name = "StartIndex")
    private int startIndex;

    @JSONField(name = "InfoItem")
    private List<InfoItem> infoItem;

    @JSONField(name = "CurrentStandardSequence")
    private int currentStandardSequence;

    @JSONField(name = "FriendNum")
    private int friendNum;

    public String getNeedUpdateAll() {
        return needUpdateAll;
    }

    public void setNeedUpdateAll(String needUpdateAll) {
        this.needUpdateAll = needUpdateAll;
    }

    public long getTimestampNow() {
        return timestampNow;
    }

    public void setTimestampNow(long timestampNow) {
        this.timestampNow = timestampNow;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public List<InfoItem> getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(List<InfoItem> infoItem) {
        this.infoItem = infoItem;
    }

    public int getCurrentStandardSequence() {
        return currentStandardSequence;
    }

    public void setCurrentStandardSequence(int currentStandardSequence) {
        this.currentStandardSequence = currentStandardSequence;
    }

    public int getFriendNum() {
        return friendNum;
    }

    public void setFriendNum(int friendNum) {
        this.friendNum = friendNum;
    }
}

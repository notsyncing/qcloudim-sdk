package io.github.notsyncing.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class BlackListGetResult extends QCloudIMResult {
    public static class BlackListItem {
        @JSONField(name = "Black_Account")
        private String blackAccount;

        @JSONField(name = "BlackTimeStamp")
        private long blackTimestamp;

        public String getBlackAccount() {
            return blackAccount;
        }

        public void setBlackAccount(String blackAccount) {
            this.blackAccount = blackAccount;
        }

        public long getBlackTimestamp() {
            return blackTimestamp;
        }

        public void setBlackTimestamp(long blackTimestamp) {
            this.blackTimestamp = blackTimestamp;
        }
    }

    @JSONField(name = "BlackListItem")
    private List<BlackListItem> blackListItem;

    @JSONField(name = "StartIndex")
    private int startIndex;

    @JSONField(name = "CurrentSequence")
    private long currentSequence;

    public List<BlackListItem> getBlackListItem() {
        return blackListItem;
    }

    public void setBlackListItem(List<BlackListItem> blackListItem) {
        this.blackListItem = blackListItem;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public long getCurrentSequence() {
        return currentSequence;
    }

    public void setCurrentSequence(long currentSequence) {
        this.currentSequence = currentSequence;
    }
}

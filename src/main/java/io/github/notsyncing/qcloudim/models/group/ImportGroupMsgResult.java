package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class ImportGroupMsgResult extends QCloudIMResult {
    public static class ImportResultItem {
        @JSONField(name = "Result")
        private int result;

        @JSONField(name = "MsgSeq")
        private long msgSeq;

        @JSONField(name = "MsgTime")
        private long msgTime;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public long getMsgSeq() {
            return msgSeq;
        }

        public void setMsgSeq(long msgSeq) {
            this.msgSeq = msgSeq;
        }

        public long getMsgTime() {
            return msgTime;
        }

        public void setMsgTime(long msgTime) {
            this.msgTime = msgTime;
        }
    }

    @JSONField(name = "ImportMsgResult")
    private List<ImportResultItem> importMsgResult;

    public List<ImportResultItem> getImportMsgResult() {
        return importMsgResult;
    }

    public void setImportMsgResult(List<ImportResultItem> importMsgResult) {
        this.importMsgResult = importMsgResult;
    }
}

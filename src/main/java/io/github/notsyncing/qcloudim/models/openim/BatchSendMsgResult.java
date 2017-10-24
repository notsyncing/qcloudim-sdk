package io.github.notsyncing.qcloudim.models.openim;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.message.ErrorListItem;

import java.util.List;

public class BatchSendMsgResult extends QCloudIMResult {
    @JSONField(name = "ErrorList")
    private List<ErrorListItem> errorList;

    public BatchSendMsgResult() {
        super();
    }

    public List<ErrorListItem> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<ErrorListItem> errorList) {
        this.errorList = errorList;
    }
}


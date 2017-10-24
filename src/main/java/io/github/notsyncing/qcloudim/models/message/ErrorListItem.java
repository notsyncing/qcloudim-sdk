package io.github.notsyncing.qcloudim.models.message;

import com.alibaba.fastjson.annotation.JSONField;

public class ErrorListItem {
    @JSONField(name = "To_Account")
    private String toAccount;

    @JSONField(name = "ErrorCode")
    private int errorCode;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

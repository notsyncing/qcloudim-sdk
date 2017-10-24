package io.github.notsyncing.qcloudim.models.friend;

import com.alibaba.fastjson.annotation.JSONField;

public class ResultItem {
    @JSONField(name = "To_Account")
    private String toAccount;

    @JSONField(name = "ResultCode")
    private int resultCode;

    @JSONField(name = "ResultInfo")
    private String resultInfo;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }
}

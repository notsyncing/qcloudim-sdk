package io.github.notsyncing.qcloudim.models;

import com.alibaba.fastjson.annotation.JSONField;

public class QCloudIMResult {
    @JSONField(name = "ActionStatus")
    private String actionStatus;

    @JSONField(name = "ErrorInfo")
    private String errorInfo;

    @JSONField(name = "ErrorCode")
    private int errorCode;

    @JSONField(name = "ErrorDisplay")
    private String errorDisplay;

    public QCloudIMResult() {

    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public boolean isSuccess() {
        return "OK".equals(actionStatus);
    }

    public boolean isFailed() {
        return !isSuccess();
    }
}

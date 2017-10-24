package io.github.notsyncing.qcloudim.models.config;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class GetAppInfoRequest extends QCloudIMRequest {
    @JSONField(name = "RequestField")
    private List<String> requestField;

    public List<String> getRequestField() {
        return requestField;
    }

    public void setRequestField(List<String> requestField) {
        this.requestField = requestField;
    }
}

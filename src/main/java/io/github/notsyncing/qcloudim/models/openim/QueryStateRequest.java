package io.github.notsyncing.qcloudim.models.openim;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class QueryStateRequest extends QCloudIMRequest {
    @JSONField(name = "To_Account")
    private List<String> toAccount;

    public QueryStateRequest(String reqIdentifier, List<String> toAccount) {
        super(reqIdentifier);
        this.toAccount = toAccount;
    }

    public QueryStateRequest(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }
}

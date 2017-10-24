package io.github.notsyncing.qcloudim.models.ologin;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class MultiAccountImportRequest extends QCloudIMRequest {
    @JSONField(name = "Accounts")
    private List<String> accounts;

    public MultiAccountImportRequest(String requestIdentifier, String identifier, List<String> accounts) {
        super(requestIdentifier);

        this.accounts = accounts;
    }

    public MultiAccountImportRequest() {
        super();
    }

    public List<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }
}

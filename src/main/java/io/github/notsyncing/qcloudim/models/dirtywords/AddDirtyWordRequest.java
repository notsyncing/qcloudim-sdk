package io.github.notsyncing.qcloudim.models.dirtywords;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class AddDirtyWordRequest extends QCloudIMRequest {
    @JSONField(name = "DirtyWordsList")
    private List<String> dirtyWordsList;

    public List<String> getDirtyWordsList() {
        return dirtyWordsList;
    }

    public void setDirtyWordsList(List<String> dirtyWordsList) {
        this.dirtyWordsList = dirtyWordsList;
    }
}

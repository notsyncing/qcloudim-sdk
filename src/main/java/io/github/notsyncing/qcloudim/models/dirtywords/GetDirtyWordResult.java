package io.github.notsyncing.qcloudim.models.dirtywords;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class GetDirtyWordResult extends QCloudIMResult {
    @JSONField(name = "DirtyWordsList")
    private List<String> dirtyWordsList;

    public List<String> getDirtyWordsList() {
        return dirtyWordsList;
    }

    public void setDirtyWordsList(List<String> dirtyWordsList) {
        this.dirtyWordsList = dirtyWordsList;
    }
}

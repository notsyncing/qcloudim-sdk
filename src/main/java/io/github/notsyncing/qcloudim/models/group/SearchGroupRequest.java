package io.github.notsyncing.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.util.List;

public class SearchGroupRequest extends QCloudIMRequest {
    public static class ResponseFilter {
        @JSONField(name = "GroupBasePublicInfoFilter")
        private List<String> groupBasePublicInfoFilter;

        public List<String> getGroupBasePublicInfoFilter() {
            return groupBasePublicInfoFilter;
        }

        public void setGroupBasePublicInfoFilter(List<String> groupBasePublicInfoFilter) {
            this.groupBasePublicInfoFilter = groupBasePublicInfoFilter;
        }
    }

    @JSONField(name = "Content")
    private String content;

    @JSONField(name = "PageNum")
    private Integer pageNum;

    @JSONField(name = "GroupPerPage")
    private Integer groupPerPage;

    @JSONField(name = "ResponseFilter")
    private ResponseFilter responseFilter;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getGroupPerPage() {
        return groupPerPage;
    }

    public void setGroupPerPage(Integer groupPerPage) {
        this.groupPerPage = groupPerPage;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }
}

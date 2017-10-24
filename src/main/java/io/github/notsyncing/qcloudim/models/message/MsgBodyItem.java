package io.github.notsyncing.qcloudim.models.message;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.message.contents.MsgContent;

public class MsgBodyItem {
    @JSONField(name = "MsgType")
    private String msgType;

    @JSONField(name = "MsgContent")
    private MsgContent msgContent;
}

package io.github.notsyncing.qcloudim.models.svc;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;

import java.io.IOException;
import java.lang.reflect.Type;

public class GetHistoryRequest extends QCloudIMRequest {
    public static class MsgTimeStringSerializer implements ObjectSerializer {
        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
            serializer.out.writeString(object.toString());
        }
    }

    @JSONField(name = "ChatType")
    private String chatType;

    @JSONField(name = "MsgTime", serializeUsing = MsgTimeStringSerializer.class)
    private long msgTime;

    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public long getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(long msgTime) {
        this.msgTime = msgTime;
    }
}

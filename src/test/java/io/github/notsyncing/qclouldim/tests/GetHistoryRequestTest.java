package io.github.notsyncing.qclouldim.tests;

import com.alibaba.fastjson.JSON;
import io.github.notsyncing.qcloudim.models.svc.GetHistoryRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetHistoryRequestTest {
    @Test
    public void testRequestToJson() {
        GetHistoryRequest req = new GetHistoryRequest();
        req.setChatType("test");
        req.setMsgTime(1234567890L);

        String expected = "{\"ChatType\":\"test\",\"MsgTime\":\"1234567890\"}";
        String actual = JSON.toJSONString(req);
        assertEquals(expected, actual);
    }
}

package io.github.notsyncing.qcloudim.models.config;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;

import java.util.List;

public class GetAppInfoResult extends QCloudIMResult {
    public static class ResultItem {
        @JSONField(name = "APNSMsgNum")
        private long apnsMsgNum;

        @JSONField(name = "ActiveUserNum")
        private long activeUserNum;

        @JSONField(name = "AppId")
        private String appId;

        @JSONField(name = "AppName")
        private String appName;

        @JSONField(name = "C2CAPNSMsgNum")
        private long c2cApnsMsgNum;

        @JSONField(name = "C2CDownMsgNum")
        private long c2cDownMsgNum;

        @JSONField(name = "C2CSendMsgUserNum")
        private long c2cSendMsgUserNum;

        @JSONField(name = "C2CUpMsgNum")
        private long c2cUpMsgNum;

        @JSONField(name = "CallBackReq")
        private long callbackReq;

        @JSONField(name = "CallBackRsp")
        private long callbackRsp;

        @JSONField(name = "ChainDecrease")
        private long chainDecrease;

        @JSONField(name = "ChainIncrease")
        private long chainIncrease;

        @JSONField(name = "Company")
        private String company;

        @JSONField(name = "Date")
        private String date;

        @JSONField(name = "DownMsgNum")
        private long downMsgNum;

        @JSONField(name = "GroupAPNSMsgNum")
        private long groupApnsMsgNum;

        @JSONField(name = "GroupAllGroupNum")
        private long groupAllGroupNum;

        @JSONField(name = "GroupDestroyGroupNum")
        private long groupDestroyGroupNum;

        @JSONField(name = "GroupDownMsgNum")
        private long groupDownMsgNum;

        @JSONField(name = "GroupJoinGroupTimes")
        private long groupJoinGroupTimes;

        @JSONField(name = "GroupNewGroupNum")
        private long groupNewGroupNum;

        @JSONField(name = "GroupQuitGroupTimes")
        private long groupQuitGroupTimes;

        @JSONField(name = "GroupSendMsgGroupNum")
        private long groupSendMsgGroupNum;

        @JSONField(name = "GroupSendMsgUserNum")
        private long groupSendMsgUserNum;

        @JSONField(name = "GroupUpMsgNum")
        private long groupUpMsgNum;

        @JSONField(name = "LoginTimes")
        private long loginTimes;

        @JSONField(name = "LoginUserNum")
        private long loginUserNum;

        @JSONField(name = "MaxOnlineNum")
        private long maxOnlineNum;

        @JSONField(name = "QQ")
        private String qq;

        @JSONField(name = "RegistUserNumOneDay")
        private long registerUserNumOneDay;

        @JSONField(name = "RegistUserNumTotal")
        private long registerUserNumTotal;

        @JSONField(name = "SendMsgUserNum")
        private long sendMsgUserNum;

        @JSONField(name = "TextMsgInNum")
        private long textMsgInNum;

        @JSONField(name = "TextMsgOutNum")
        private long txtMsgOutNum;

        @JSONField(name = "UpMsgNum")
        private long upMsgNum;

        @JSONField(name = "VoiceMsgInNum")
        private long voiceMsgInNum;

        @JSONField(name = "VoiceMsgOutNum")
        private long voiceMsgOutNum;

        public long getApnsMsgNum() {
            return apnsMsgNum;
        }

        public void setApnsMsgNum(long apnsMsgNum) {
            this.apnsMsgNum = apnsMsgNum;
        }

        public long getActiveUserNum() {
            return activeUserNum;
        }

        public void setActiveUserNum(long activeUserNum) {
            this.activeUserNum = activeUserNum;
        }

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public long getC2cApnsMsgNum() {
            return c2cApnsMsgNum;
        }

        public void setC2cApnsMsgNum(long c2cApnsMsgNum) {
            this.c2cApnsMsgNum = c2cApnsMsgNum;
        }

        public long getC2cDownMsgNum() {
            return c2cDownMsgNum;
        }

        public void setC2cDownMsgNum(long c2cDownMsgNum) {
            this.c2cDownMsgNum = c2cDownMsgNum;
        }

        public long getC2cSendMsgUserNum() {
            return c2cSendMsgUserNum;
        }

        public void setC2cSendMsgUserNum(long c2cSendMsgUserNum) {
            this.c2cSendMsgUserNum = c2cSendMsgUserNum;
        }

        public long getC2cUpMsgNum() {
            return c2cUpMsgNum;
        }

        public void setC2cUpMsgNum(long c2cUpMsgNum) {
            this.c2cUpMsgNum = c2cUpMsgNum;
        }

        public long getCallbackReq() {
            return callbackReq;
        }

        public void setCallbackReq(long callbackReq) {
            this.callbackReq = callbackReq;
        }

        public long getCallbackRsp() {
            return callbackRsp;
        }

        public void setCallbackRsp(long callbackRsp) {
            this.callbackRsp = callbackRsp;
        }

        public long getChainDecrease() {
            return chainDecrease;
        }

        public void setChainDecrease(long chainDecrease) {
            this.chainDecrease = chainDecrease;
        }

        public long getChainIncrease() {
            return chainIncrease;
        }

        public void setChainIncrease(long chainIncrease) {
            this.chainIncrease = chainIncrease;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public long getDownMsgNum() {
            return downMsgNum;
        }

        public void setDownMsgNum(long downMsgNum) {
            this.downMsgNum = downMsgNum;
        }

        public long getGroupApnsMsgNum() {
            return groupApnsMsgNum;
        }

        public void setGroupApnsMsgNum(long groupApnsMsgNum) {
            this.groupApnsMsgNum = groupApnsMsgNum;
        }

        public long getGroupAllGroupNum() {
            return groupAllGroupNum;
        }

        public void setGroupAllGroupNum(long groupAllGroupNum) {
            this.groupAllGroupNum = groupAllGroupNum;
        }

        public long getGroupDestroyGroupNum() {
            return groupDestroyGroupNum;
        }

        public void setGroupDestroyGroupNum(long groupDestroyGroupNum) {
            this.groupDestroyGroupNum = groupDestroyGroupNum;
        }

        public long getGroupDownMsgNum() {
            return groupDownMsgNum;
        }

        public void setGroupDownMsgNum(long groupDownMsgNum) {
            this.groupDownMsgNum = groupDownMsgNum;
        }

        public long getGroupJoinGroupTimes() {
            return groupJoinGroupTimes;
        }

        public void setGroupJoinGroupTimes(long groupJoinGroupTimes) {
            this.groupJoinGroupTimes = groupJoinGroupTimes;
        }

        public long getGroupNewGroupNum() {
            return groupNewGroupNum;
        }

        public void setGroupNewGroupNum(long groupNewGroupNum) {
            this.groupNewGroupNum = groupNewGroupNum;
        }

        public long getGroupQuitGroupTimes() {
            return groupQuitGroupTimes;
        }

        public void setGroupQuitGroupTimes(long groupQuitGroupTimes) {
            this.groupQuitGroupTimes = groupQuitGroupTimes;
        }

        public long getGroupSendMsgGroupNum() {
            return groupSendMsgGroupNum;
        }

        public void setGroupSendMsgGroupNum(long groupSendMsgGroupNum) {
            this.groupSendMsgGroupNum = groupSendMsgGroupNum;
        }

        public long getGroupSendMsgUserNum() {
            return groupSendMsgUserNum;
        }

        public void setGroupSendMsgUserNum(long groupSendMsgUserNum) {
            this.groupSendMsgUserNum = groupSendMsgUserNum;
        }

        public long getGroupUpMsgNum() {
            return groupUpMsgNum;
        }

        public void setGroupUpMsgNum(long groupUpMsgNum) {
            this.groupUpMsgNum = groupUpMsgNum;
        }

        public long getLoginTimes() {
            return loginTimes;
        }

        public void setLoginTimes(long loginTimes) {
            this.loginTimes = loginTimes;
        }

        public long getLoginUserNum() {
            return loginUserNum;
        }

        public void setLoginUserNum(long loginUserNum) {
            this.loginUserNum = loginUserNum;
        }

        public long getMaxOnlineNum() {
            return maxOnlineNum;
        }

        public void setMaxOnlineNum(long maxOnlineNum) {
            this.maxOnlineNum = maxOnlineNum;
        }

        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }

        public long getRegisterUserNumOneDay() {
            return registerUserNumOneDay;
        }

        public void setRegisterUserNumOneDay(long registerUserNumOneDay) {
            this.registerUserNumOneDay = registerUserNumOneDay;
        }

        public long getRegisterUserNumTotal() {
            return registerUserNumTotal;
        }

        public void setRegisterUserNumTotal(long registerUserNumTotal) {
            this.registerUserNumTotal = registerUserNumTotal;
        }

        public long getSendMsgUserNum() {
            return sendMsgUserNum;
        }

        public void setSendMsgUserNum(long sendMsgUserNum) {
            this.sendMsgUserNum = sendMsgUserNum;
        }

        public long getTextMsgInNum() {
            return textMsgInNum;
        }

        public void setTextMsgInNum(long textMsgInNum) {
            this.textMsgInNum = textMsgInNum;
        }

        public long getTxtMsgOutNum() {
            return txtMsgOutNum;
        }

        public void setTxtMsgOutNum(long txtMsgOutNum) {
            this.txtMsgOutNum = txtMsgOutNum;
        }

        public long getUpMsgNum() {
            return upMsgNum;
        }

        public void setUpMsgNum(long upMsgNum) {
            this.upMsgNum = upMsgNum;
        }

        public long getVoiceMsgInNum() {
            return voiceMsgInNum;
        }

        public void setVoiceMsgInNum(long voiceMsgInNum) {
            this.voiceMsgInNum = voiceMsgInNum;
        }

        public long getVoiceMsgOutNum() {
            return voiceMsgOutNum;
        }

        public void setVoiceMsgOutNum(long voiceMsgOutNum) {
            this.voiceMsgOutNum = voiceMsgOutNum;
        }
    }

    @JSONField(name = "Result")
    private List<ResultItem> result;

    public List<ResultItem> getResult() {
        return result;
    }

    public void setResult(List<ResultItem> result) {
        this.result = result;
    }
}

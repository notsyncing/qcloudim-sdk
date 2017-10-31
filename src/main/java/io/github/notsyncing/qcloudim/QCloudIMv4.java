package io.github.notsyncing.qcloudim;

import com.alibaba.fastjson.JSON;
import io.github.notsyncing.qcloudim.models.QCloudIMRequest;
import io.github.notsyncing.qcloudim.models.QCloudIMResult;
import io.github.notsyncing.qcloudim.models.config.*;
import io.github.notsyncing.qcloudim.models.dirtywords.*;
import io.github.notsyncing.qcloudim.models.group.*;
import io.github.notsyncing.qcloudim.models.ologin.*;
import io.github.notsyncing.qcloudim.models.openim.*;
import io.github.notsyncing.qcloudim.models.profile.PortraitGetRequest;
import io.github.notsyncing.qcloudim.models.profile.PortraitGetResult;
import io.github.notsyncing.qcloudim.models.profile.PortraitSetRequest;
import io.github.notsyncing.qcloudim.models.profile.PortraitSetResult;
import io.github.notsyncing.qcloudim.models.sns.*;
import io.github.notsyncing.qcloudim.models.svc.GetHistoryRequest;
import io.github.notsyncing.qcloudim.models.svc.GetHistoryResult;
import io.github.notsyncing.qcloudim.utils.TlsSignature;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SignatureException;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class QCloudIMv4 {
    private static final String apiUrl = "https://console.tim.qq.com/v4/";

    private String appId;
    private String publicKey;
    private String privateKey;
    private Random random = new Random();
    private CloseableHttpClient client = HttpClients.createDefault();

    public IMOpenLoginSvc imOpenLoginSvc = new IMOpenLoginSvc();
    public OpenIM openIM = new OpenIM();
    public Profile profile = new Profile();
    public SNS sns = new SNS();
    public GroupOpenSvc groupOpenSvc = new GroupOpenSvc();
    public OpenIMDirtyWords dirtyWords = new OpenIMDirtyWords();
    public OpenConfigSvr openConfigSvr = new OpenConfigSvr();
    public OpenMsgSvc openMsgSvc = new OpenMsgSvc();

    public QCloudIMv4(String appId, String publicKey, String privateKey) {
        this.appId = appId;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public QCloudIMv4(String appId, Path publicKeyFile, Path privateKeyFile) throws IOException {
        this(appId, "", "");

        this.publicKey = new String(Files.readAllBytes(publicKeyFile), "utf-8");
        this.privateKey = new String(Files.readAllBytes(privateKeyFile), "utf-8");
    }

    private String makeApiUrl(String serviceName, String actionName, QCloudIMRequest request) {
        return apiUrl + serviceName + "/" + actionName + "?usersig=" + request.getUserSig() + "&identifier=" +
                request.getReqIdentifier() + "&sdkappid=" + request.getAppId() + "&random=" + request.getRandom() +
                "&contenttype=json";
    }

    private <REQ extends QCloudIMRequest, RESP extends QCloudIMResult> RESP request(String serviceName,
                                                                                    String actionName,
                                                                                    REQ request,
                                                                                    Class<RESP> responseClass) throws IOException, SignatureException {
        request.setAppId(appId);
        request.setRandom(String.valueOf(random.nextInt()));

        try {
            String userSig = TlsSignature.genTLSSignatureEx(appId, request.getReqIdentifier(), privateKey).urlSig;
            request.setUserSig(userSig);
        } catch (Exception e) {
            throw new SignatureException("Failed to generate signature for " + serviceName + " " + actionName + " " +
                    request.getReqIdentifier(), e);
        }

        HttpEntity entity = new StringEntity(request.toJSONString());

        HttpPost post = new HttpPost(makeApiUrl(serviceName, actionName, request));
        post.setEntity(entity);

        try (CloseableHttpResponse resp = client.execute(post)) {
            HttpEntity respEntity = resp.getEntity();

            if (resp.getStatusLine().getStatusCode() != 200) {
                throw new IOException("Failed to request QCloud IM API " + actionName + ": " +
                        resp.getStatusLine().getStatusCode() + " " + resp.getStatusLine().getReasonPhrase());
            }

            String result = EntityUtils.toString(respEntity);

            return JSON.parseObject(result, responseClass);
        }
    }

    private <REQ extends QCloudIMRequest, RESP extends QCloudIMResult> CompletableFuture<RESP> requestAsync(String serviceName,
                                                                                                            String actionName,
                                                                                                            REQ request,
                                                                                                            Class<RESP> responseClass) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return request(serviceName, actionName, request, responseClass);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }

    public class IMOpenLoginSvc {
        public AccountImportResult accountImport(AccountImportRequest request) throws IOException, SignatureException {
            return request("im_open_login_svc", "account_import", request, AccountImportResult.class);
        }

        public CompletableFuture<AccountImportResult> accountImportAsync(AccountImportRequest request) {
            return requestAsync("im_open_login_svc", "account_import", request, AccountImportResult.class);
        }

        public MultiAccountImportResult multiAccountImport(MultiAccountImportRequest request) throws IOException, SignatureException {
            return request("im_open_login_svc", "multiaccount_import", request, MultiAccountImportResult.class);
        }

        public CompletableFuture<MultiAccountImportResult> multiAccountImportAsync(MultiAccountImportRequest request) {
            return requestAsync("im_open_login_svc", "multiaccount_import", request, MultiAccountImportResult.class);
        }

        public KickResult kick(KickRequest request) throws IOException, SignatureException {
            return request("im_open_login_svc", "kick", request, KickResult.class);
        }

        public CompletableFuture<KickResult> kickAsync(KickRequest request) {
            return requestAsync("im_open_login_svc", "kick", request, KickResult.class);
        }

        public RegisterAccountResult registerAccount(RegisterAccountRequest request) throws IOException, SignatureException {
            return request("im_open_login_svc", "register_account_v1", request, RegisterAccountResult.class);
        }

        public CompletableFuture<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest request) {
            return requestAsync("im_open_login_svc", "register_account_v1", request, RegisterAccountResult.class);
        }
    }

    public class OpenIM {
        public SendMsgResult sendMsg(SendMsgRequest request) throws IOException, SignatureException {
            return request("openim", "sendmsg", request, SendMsgResult.class);
        }

        public CompletableFuture<SendMsgResult> sendMsgAsync(SendMsgRequest request) {
            return requestAsync("openim", "sendmsg", request, SendMsgResult.class);
        }

        public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest request) throws IOException, SignatureException {
            return request("openim", "batchsendmsg", request, BatchSendMsgResult.class);
        }

        public CompletableFuture<BatchSendMsgResult> batchSendMsgAsync(BatchSendMsgRequest request) {
            return requestAsync("openim", "batchsendmsg", request, BatchSendMsgResult.class);
        }

        public ImportMsgResult importMsg(ImportMsgRequest request) throws IOException, SignatureException {
            return request("openim", "importmsg", request, ImportMsgResult.class);
        }

        public CompletableFuture<ImportMsgResult> importMsgAsync(ImportMsgRequest request) {
            return requestAsync("openim", "importmsg", request, ImportMsgResult.class);
        }

        public QueryStateResult queryState(QueryStateRequest request) throws IOException, SignatureException {
            return request("openim", "querystate", request, QueryStateResult.class);
        }

        public CompletableFuture<QueryStateResult> queryStateAsync(QueryStateRequest request) {
            return requestAsync("openim", "querystate", request, QueryStateResult.class);
        }
    }

    public class Profile {
        public PortraitGetResult portraitGet(PortraitGetRequest request) throws IOException, SignatureException {
            return request("profile", "portrait_get", request, PortraitGetResult.class);
        }

        public CompletableFuture<PortraitGetResult> portraitGetAsync(PortraitGetRequest request) {
            return requestAsync("profile", "portrait_get", request, PortraitGetResult.class);
        }

        public PortraitSetResult portraitSet(PortraitSetRequest request) throws IOException, SignatureException {
            return request("profile", "portrait_set", request, PortraitSetResult.class);
        }

        public CompletableFuture<PortraitSetResult> portraitSetAsync(PortraitSetRequest request) {
            return requestAsync("profile", "portrait_set", request, PortraitSetResult.class);
        }
    }

    public class SNS {
        public FriendAddResult friendAdd(FriendAddRequest request) throws IOException, SignatureException {
            return request("sns", "friend_add", request, FriendAddResult.class);
        }

        public CompletableFuture<FriendAddResult> friendAddAsync(FriendAddRequest request) {
            return requestAsync("sns", "friend_add", request, FriendAddResult.class);
        }

        public FriendImportResult friendImport(FriendImportRequest request) throws IOException, SignatureException {
            return request("sns", "friend_import", request, FriendImportResult.class);
        }

        public CompletableFuture<FriendImportResult> friendImportAsync(FriendImportRequest request) {
            return requestAsync("sns", "friend_import", request, FriendImportResult.class);
        }

        public FriendDeleteResult friendDelete(FriendDeleteRequest request) throws IOException, SignatureException {
            return request("sns", "friend_delete", request, FriendDeleteResult.class);
        }

        public CompletableFuture<FriendDeleteResult> friendDeleteAsync(FriendDeleteRequest request) {
            return requestAsync("sns", "friend_delete", request, FriendDeleteResult.class);
        }

        public FriendDeleteAllResult friendDeleteAll(FriendDeleteAllRequest request) throws IOException, SignatureException {
            return request("sns", "friend_delete_all", request, FriendDeleteAllResult.class);
        }

        public CompletableFuture<FriendDeleteAllResult> friendDeleteAllAsync(FriendDeleteAllRequest request) {
            return requestAsync("sns", "friend_delete_all", request, FriendDeleteAllResult.class);
        }

        public FriendCheckResult friendCheck(FriendCheckRequest request) throws IOException, SignatureException {
            return request("sns", "friend_check", request, FriendCheckResult.class);
        }

        public CompletableFuture<FriendCheckResult> friendCheckAsync(FriendCheckRequest request) {
            return requestAsync("sns", "friend_check", request, FriendCheckResult.class);
        }

        public FriendGetAllResult friendGetAll(FriendGetAllRequest request) throws IOException, SignatureException {
            return request("sns", "friend_get_all", request, FriendGetAllResult.class);
        }

        public CompletableFuture<FriendGetAllResult> friendGetAllAsync(FriendGetAllRequest request) {
            return requestAsync("sns", "friend_get_all", request, FriendGetAllResult.class);
        }

        public FriendGetListResult friendGetList(FriendGetListRequest request) throws IOException, SignatureException {
            return request("sns", "friend_get_list", request, FriendGetListResult.class);
        }

        public CompletableFuture<FriendGetListResult> friendGetListAsync(FriendGetListRequest request) {
            return requestAsync("sns", "friend_get_list", request, FriendGetListResult.class);
        }

        public BlackListAddResult blackListAdd(BlackListAddRequest request) throws IOException, SignatureException {
            return request("sns", "black_list_add", request, BlackListAddResult.class);
        }

        public CompletableFuture<BlackListAddResult> blackListAddAsync(BlackListAddRequest request) {
            return requestAsync("sns", "black_list_add", request, BlackListAddResult.class);
        }

        public BlackListDeleteResult blackListDelete(BlackListDeleteRequest request) throws IOException, SignatureException {
            return request("sns", "black_list_delete", request, BlackListDeleteResult.class);
        }

        public CompletableFuture<BlackListDeleteResult> blackListDeleteAsync(BlackListDeleteRequest request) {
            return requestAsync("sns", "black_list_delete", request, BlackListDeleteResult.class);
        }

        public BlackListGetResult blackListGet(BlackListGetRequest request) throws IOException, SignatureException {
            return request("sns", "black_list_get", request, BlackListGetResult.class);
        }

        public CompletableFuture<BlackListGetResult> blackListGetAsync(BlackListGetRequest request) {
            return requestAsync("sns", "black_list_get", request, BlackListGetResult.class);
        }

        public BlackListCheckResult blackListCheck(BlackListCheckRequest request) throws IOException, SignatureException {
            return request("sns", "black_list_check", request, BlackListCheckResult.class);
        }

        public CompletableFuture<BlackListCheckResult> blackListCheckAsync(BlackListCheckRequest request) {
            return requestAsync("sns", "black_list_check", request, BlackListCheckResult.class);
        }

        public GroupAddResult groupAdd(GroupAddRequest request) throws IOException, SignatureException {
            return request("sns", "group_add", request, GroupAddResult.class);
        }

        public CompletableFuture<GroupAddResult> groupAddAsync(GroupAddRequest request) {
            return requestAsync("sns", "group_add", request, GroupAddResult.class);
        }

        public GroupDeleteResult groupDelete(GroupDeleteRequest request) throws IOException, SignatureException {
            return request("sns", "group_delete", request, GroupDeleteResult.class);
        }

        public CompletableFuture<GroupDeleteResult> groupDeleteAsync(GroupDeleteRequest request) {
            return requestAsync("sns", "group_delete", request, GroupDeleteResult.class);
        }
    }

    public class GroupOpenSvc {
        public GetGroupListResult getGroupList(GetGroupListRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "get_appid_group_list", request, GetGroupListResult.class);
        }

        public CompletableFuture<GetGroupListResult> getGroupListAsync(GetGroupListRequest request) {
            return requestAsync("group_open_http_svc", "get_appid_group_list", request, GetGroupListResult.class);
        }

        public CreateGroupResult createGroup(CreateGroupRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "create_group", request, CreateGroupResult.class);
        }

        public CompletableFuture<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {
            return requestAsync("group_open_http_svc", "create_group", request, CreateGroupResult.class);
        }

        public GetGroupInfoResult getGroupInfo(GetGroupInfoRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "get_group_info", request, GetGroupInfoResult.class);
        }

        public CompletableFuture<GetGroupInfoResult> getGroupInfoAsync(GetGroupInfoRequest request) {
            return requestAsync("group_open_http_svc", "get_group_info", request, GetGroupInfoResult.class);
        }

        public GetGroupMemberInfoResult getGroupMemberInfo(GetGroupMemberInfoRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "get_group_member_info", request, GetGroupMemberInfoResult.class);
        }

        public CompletableFuture<GetGroupMemberInfoResult> getGroupMemberInfoAsync(GetGroupMemberInfoRequest request) {
            return requestAsync("group_open_http_svc", "get_group_member_info", request, GetGroupMemberInfoResult.class);
        }

        public ModifyGroupBaseInfoResult modifyGroupBaseInfo(ModifyGroupBaseInfoRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "modify_group_base_info", request, ModifyGroupBaseInfoResult.class);
        }

        public CompletableFuture<ModifyGroupBaseInfoResult> modifyGroupBaseInfoAsync(ModifyGroupBaseInfoRequest request) {
            return requestAsync("group_open_http_svc", "modify_group_base_info", request, ModifyGroupBaseInfoResult.class);
        }

        public AddGroupMemberResult addGroupMember(AddGroupMemberRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "add_group_member", request, AddGroupMemberResult.class);
        }

        public CompletableFuture<AddGroupMemberResult> addGroupMemberAsync(AddGroupMemberRequest request) {
            return requestAsync("group_open_http_svc", "add_group_member", request, AddGroupMemberResult.class);
        }

        public DeleteGroupMemberResult deleteGroupMember(DeleteGroupMemberRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "delete_group_member", request, DeleteGroupMemberResult.class);
        }

        public CompletableFuture<DeleteGroupMemberResult> deleteGroupMemberAsync(DeleteGroupMemberRequest request) {
            return requestAsync("group_open_http_svc", "delete_group_member", request, DeleteGroupMemberResult.class);
        }

        public ModifyGroupMemberInfoResult modifyGroupMemberInfo(ModifyGroupMemberInfoRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "modify_group_member_info", request, ModifyGroupMemberInfoResult.class);
        }

        public CompletableFuture<ModifyGroupMemberInfoResult> modifyGroupMemberInfoAsync(ModifyGroupMemberInfoRequest request) {
            return requestAsync("group_open_http_svc", "modify_group_member_info", request, ModifyGroupMemberInfoResult.class);
        }

        public DestroyGroupResult destroyGroup(DestroyGroupRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "destroy_group", request, DestroyGroupResult.class);
        }

        public CompletableFuture<DestroyGroupResult> destroyGroupAsync(DestroyGroupRequest request) {
            return requestAsync("group_open_http_svc", "destroy_group", request, DestroyGroupResult.class);
        }

        public GetJoinedGroupListResult getJoinedGroupList(GetJoinedGroupListRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "get_joined_group_list", request, GetJoinedGroupListResult.class);
        }

        public CompletableFuture<GetJoinedGroupListResult> getJoinedGroupListAsync(GetJoinedGroupListRequest request) {
            return requestAsync("group_open_http_svc", "get_joined_group_list", request, GetJoinedGroupListResult.class);
        }

        public GetRoleInGroupResult getRoleInGroup(GetRoleInGroupRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "get_role_in_group", request, GetRoleInGroupResult.class);
        }

        public CompletableFuture<GetRoleInGroupResult> getRoleInGroupAsync(GetRoleInGroupRequest request) {
            return requestAsync("group_open_http_svc", "get_role_in_group", request, GetRoleInGroupResult.class);
        }

        public ForbidSendMsgResult forbidSendMsg(ForbidSendMsgRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "forbid_send_msg", request, ForbidSendMsgResult.class);
        }

        public CompletableFuture<ForbidSendMsgResult> forbidSendMsgAsync(ForbidSendMsgRequest request) {
            return requestAsync("group_open_http_svc", "forbid_send_msg", request, ForbidSendMsgResult.class);
        }

        public GetGroupShuttedUinResult getGroupShuttedUin(GetGroupShuttedUinRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "get_group_shutted_uin", request, GetGroupShuttedUinResult.class);
        }

        public CompletableFuture<GetGroupShuttedUinResult> getGroupShuttedUinAsync(GetGroupShuttedUinRequest request) {
            return requestAsync("group_open_http_svc", "get_group_shutted_uin", request, GetGroupShuttedUinResult.class);
        }

        public SendGroupMsgResult sendGroupMsg(SendGroupMsgRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "send_group_msg", request, SendGroupMsgResult.class);
        }

        public CompletableFuture<SendGroupMsgResult> sendGroupMsgAsync(SendGroupMsgRequest request) {
            return requestAsync("group_open_http_svc", "send_group_msg", request, SendGroupMsgResult.class);
        }

        public SendGroupSystemNotificationResult sendGroupSystemNotification(SendGroupSystemNotificationRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "send_group_system_notification", request, SendGroupSystemNotificationResult.class);
        }

        public CompletableFuture<SendGroupSystemNotificationResult> sendGroupSystemNotificationAsync(SendGroupSystemNotificationRequest request) {
            return requestAsync("group_open_http_svc", "send_group_system_notification", request, SendGroupSystemNotificationResult.class);
        }

        public ChangeGroupOwnerResult changeGroupOwner(ChangeGroupOwnerRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "change_group_owner", request, ChangeGroupOwnerResult.class);
        }

        public CompletableFuture<ChangeGroupOwnerResult> changeGroupOwnerAsync(ChangeGroupOwnerRequest request) {
            return requestAsync("group_open_http_svc", "change_group_owner", request, ChangeGroupOwnerResult.class);
        }

        public ImportGroupResult importGroup(ImportGroupRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "import_group", request, ImportGroupResult.class);
        }

        public CompletableFuture<ImportGroupResult> importGroupAsync(ImportGroupRequest request) {
            return requestAsync("group_open_http_svc", "import_group", request, ImportGroupResult.class);
        }

        public ImportGroupMsgResult importGroupMsg(ImportGroupMsgRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "import_group_msg", request, ImportGroupMsgResult.class);
        }

        public CompletableFuture<ImportGroupMsgResult> importGroupMsgAsync(ImportGroupMsgRequest request) {
            return requestAsync("group_open_http_svc", "import_group_msg", request, ImportGroupMsgResult.class);
        }

        public ImportGroupMemberResult importGroupMember(ImportGroupMemberRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "import_group_member", request, ImportGroupMemberResult.class);
        }

        public CompletableFuture<ImportGroupMemberResult> importGroupMemberAsync(ImportGroupMemberRequest request) {
            return requestAsync("group_open_http_svc", "import_group_member", request, ImportGroupMemberResult.class);
        }

        public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "set_unread_msg_num", request, SetUnreadMsgNumResult.class);
        }

        public CompletableFuture<SetUnreadMsgNumResult> setUnreadMsgNumAsync(SetUnreadMsgNumRequest request) {
            return requestAsync("group_open_http_svc", "set_unread_msg_num", request, SetUnreadMsgNumResult.class);
        }

        public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "delete_group_msg_by_sender", request, DeleteGroupMsgBySenderResult.class);
        }

        public CompletableFuture<DeleteGroupMsgBySenderResult> deleteGroupMsgBySenderAsync(DeleteGroupMsgBySenderRequest request) {
            return requestAsync("group_open_http_svc", "delete_group_msg_by_sender", request, DeleteGroupMsgBySenderResult.class);
        }

        public SearchGroupResult searchGroup(SearchGroupRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "search_group", request, SearchGroupResult.class);
        }

        public CompletableFuture<SearchGroupResult> searchGroupAsync(SearchGroupRequest request) {
            return requestAsync("group_open_http_svc", "search_group", request, SearchGroupResult.class);
        }

        public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest request) throws IOException, SignatureException {
            return request("group_open_http_svc", "group_msg_get_simple", request, GroupMsgGetSimpleResult.class);
        }

        public CompletableFuture<GroupMsgGetSimpleResult> groupMsgGetSimpleAsync(GroupMsgGetSimpleRequest request) {
            return requestAsync("group_open_http_svc", "group_msg_get_simple", request, GroupMsgGetSimpleResult.class);
        }
    }

    public class OpenIMDirtyWords {
        public GetDirtyWordResult get(GetDirtyWordRequest request) throws IOException, SignatureException {
            return request("openim_dirty_words", "get", request, GetDirtyWordResult.class);
        }

        public CompletableFuture<GetDirtyWordResult> getAsync(GetDirtyWordRequest request) {
            return requestAsync("openim_dirty_words", "get", request, GetDirtyWordResult.class);
        }

        public AddDirtyWordResult add(AddDirtyWordRequest request) throws IOException, SignatureException {
            return request("openim_dirty_words", "add", request, AddDirtyWordResult.class);
        }

        public CompletableFuture<AddDirtyWordResult> addAsync(AddDirtyWordRequest request) {
            return requestAsync("openim_dirty_words", "add", request, AddDirtyWordResult.class);
        }

        public DeleteDirtyWordResult delete(DeleteDirtyWordRequest request) throws IOException, SignatureException {
            return request("openim_dirty_words", "delete", request, DeleteDirtyWordResult.class);
        }

        public CompletableFuture<DeleteDirtyWordResult> deleteAsync(DeleteDirtyWordRequest request) {
            return requestAsync("openim_dirty_words", "delete", request, DeleteDirtyWordResult.class);
        }
    }

    public class OpenConfigSvr {
        public SetNoSpeakingResult setNoSpeaking(SetNoSpeakingRequest request) throws IOException, SignatureException {
            return request("openconfigsvr", "setnospeaking", request, SetNoSpeakingResult.class);
        }

        public CompletableFuture<SetNoSpeakingResult> setNoSpeakingAsync(SetNoSpeakingRequest request) {
            return requestAsync("openconfigsvr", "setnospeaking", request, SetNoSpeakingResult.class);
        }

        public GetNoSpeakingResult getNoSpeaking(GetNoSpeakingRequest request) throws IOException, SignatureException {
            return request("openconfigsvr", "getnospeaking", request, GetNoSpeakingResult.class);
        }

        public CompletableFuture<GetNoSpeakingResult> getNoSpeakingAsync(GetNoSpeakingRequest request) {
            return requestAsync("openconfigsvr", "getnospeaking", request, GetNoSpeakingResult.class);
        }

        public GetAppInfoResult getAppInfo(GetAppInfoRequest request) throws IOException, SignatureException {
            return request("openconfigsvr", "getappinfo", request, GetAppInfoResult.class);
        }

        public CompletableFuture<GetAppInfoResult> getAppInfoAsync(GetAppInfoRequest request) {
            return requestAsync("openconfigsvr", "getappinfo", request, GetAppInfoResult.class);
        }
    }

    public class OpenMsgSvc {
        public GetHistoryResult getHistory(GetHistoryRequest request) throws IOException, SignatureException {
            return request("open_msg_svc", "get_history", request, GetHistoryResult.class);
        }

        public CompletableFuture<GetHistoryResult> getHistoryAsync(GetHistoryRequest request) {
            return requestAsync("open_msg_svc", "get_history", request, GetHistoryResult.class);
        }
    }
}

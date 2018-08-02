package com.cirse.mvppt.aother.retrofithttp;

import com.cirse.mvppt.aother.Const.ConstApi;
import com.cirse.mvppt.model.been.Login;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 注释：Retrofit 请求接口
 * ===========================
 * Author by Jack
 * Created by Ender on 10:09
 */

public interface ApiStores {

    //BaseUrl
//    String API_SERVICE_URL = "";

//    /*
//    * Get请求
//    * */
//    @GET(*/*/{}.html)
//    Call<?> getExemple(path);

//    /*
//    * Post请求
//    * 普通
//    * */
//    @FormUrlEncoded
//    @POST("*/*")
//    Call postHttp(@Field("*") String str, @Field("*") String str1);
//
//    /*
//    * Post请求
//    * Map键值对
//    * */
//    @FormUrlEncoded
//    @POST("*/*")
//    Call postHttp1(@FieldMap Map<String, String> map);

//    /*
//    * Post请求
//    * Post Json数据
//    * @param been post数据为json时的json been类
//    * */
//    @FormUrlEncoded
//    @POST("*/*")
//    Call postJsonData(@Body Been been);
//     baseUrl
//    String API_SERVER_URL = "http://www.weather.com.cn/";

    //加载天气
//    @GET("adat/sk/{cityId}.html")
//    Call<MainModel> loadDataByRetrofit(@Path("cityId") String cityId);
//
//    //加载天气
//    @GET("adat/sk/{cityId}.html")
//    Observable<MainModel> loadDataByRetrofitRxjava(@Path("cityId") String cityId);
//
//    //加载天气
//    @GET("adat/sk/{cityId}.html")
//    Observable<TestModel> loadDataByRetrofit1(@Path("cityId") String cityId);
//

//    @GET(ConstApi.API_HOME_BANNER)
//    Call<UserNetBeen> loadDataByRetrofit2();
//    @GET(ConstApi.API_USE_NET)
//    Call<HomeBannerModle> loadDataByRetrofit1();

//    @FormUrlEncoded
//    @POST("*/*")
//    Call<Object> loadData(@FieldMap HashMap<String, String> hashMap);
//
    String API_SERVER_URL = ConstApi.HTTP_HOST;

//    /**
//     * 获取图片验证码
//     * */
//    @GET("captcha")
//    Call<ValidateCodeImg> getValidateCodeImg();
//
//    /**
//     * 注册请求验证码
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("register/sms-code")
//    Call<RegistValidCode> getRegistValidcode(@Body HashMap<String, String> hashMap);
//
//    /**
//     * 注册
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("register")
//    Call<Regist> regist(@Body HashMap<String, String> hashMap);

    /**
     * 登录
     * */
    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
    @POST("login")
    Call<Login> login(@Body HashMap<String, String> hashMap);

//    /**
//     * 获取登陆用户信息
//     * */
//    @GET("my/info")
//    Call<LoginUserInfor> getLoginUserInfor(@Header("token") String token);
//
//    /**
//     *
//     * 账户信息
//     * */
//    @GET("api/portal/my/account")
//    Call<UserAccountInfor> getUserAccountInfor(@Header("token") String token);
//
//    /**
//     *
//     * 获取用户实名认证信息
//     * */
//    @GET("api/portal/my/safety")
//    Call<UserAuthInfor> getUserAuthInfor(@Header("token") String token);
//
//    /**
//     * 提交实名信息
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/safety/real-name-certified")
//    Call<CommitAuthInfor> commitAuthInfor(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
////    /**
////     * 充值
////     * */
////    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
////    @POST("api/portal/my/recharge")
////    Call<Recharge> recharge(@Body HashMap<String, String> hashMap);
//
//    /**
//     * 获取投资标列表
//     * */
//    @GET("api/portal/loan")
//    Call<InvestPrtList> getInvestPrtList(@Header("token") String token);
//
//    /**
//     * 投资标详情
//     * */
//    @GET("api/portal/loan/{loanProjectId}")
//    Call<InvestPrtListDetails> getInvestPrtListDetails(@Header("token") String token,
//                                                       @Path("loanProjectId") String loanProjectId);
//
//    /**
//     * 获取当前用户的银行卡信息
//     * */
//    @GET("api/portal/my/bank-card")
//    Call<BankCardList> getBankCardList(@Header("token") String token);
//
//    /**
//     * 绑定用户的银行卡
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/bank-card")
//    Call<BindBankCard> bindBankCard(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//     * 投资记录
//     * */
//    @GET("api/portal/invest/{loanProjectId}/list")
//    Call<InvestRecords> investRecords(@Header("token") String token, @Path("loanProjectId") String loanProjectIdS);
//
//    /**
//     * 投资
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/invest")
//    Call<Invest>invest(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//     * 提现
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/withdraw")
//    Call<Withdraw> withdraw(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//     * 投资记录
//     * */
//    @GET("api/portal/my/tender")//api/portal/my/tender{?loanProjectName,orderNum,statusList,startTime,endTime}
//    Call<MyInvestRecord> getMyInvestRecord(@Header("token") String token);
//
//    /**
//     * 提现记录
//     * */
//    @GET("api/portal/my/withdraw{?orderNum,status,startTime,endTime}")
//    Call<WithdrawRecord> withdrawRecord(@Header("token") String token);
//
//   /**
//     * 充值记录
//     * */
//    @GET("api/portal/my/recharge{?orderNum,status,startTime,endTime}")
//    Call<RechargeRecord> rechargeRecord(@Header("token") String token);
//
//    /**
//     * 设置交易密码
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/safety/set-pay-pwd")
//    Call<SetTransPsd> setTransPsd(@Header("token") String token, @Body HashMap<String, String> hashMap);
//    /**
//     * 修改交易密码
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/safety/recover-loginpwd")
//    Call<ChangeTransPsd> changeTransPsd(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//     * 修改交易密码发送短信验证码
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/safety/recover-paypwd/sms-code")
//    Call<ChangeTransPsdSendSmsCode> changeTransPsdSendSmsCode(@Header("token") String token);
//
//    /**
//     * 忘记密码发送验证码
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("recover-loginpwd/sms-code")
//    Call<ForgetPsdSmsCode> forgetPsdSmsCode(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//     * 忘记登陆密码
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("recover-loginpwd")
//    Call<ForgetPsd> forgetPsd(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//      * 交易记录
//     * */
//    @GET("api/portal/my/bill")// api/portal/my/bill{?transNum,capitalFlows,payBy,transClassified,status,startTime,endTime}
//    Call<TransRecord> transRecord(@Header("token") String token);
//
//    /**
//     * 待收列表
//     * */
//    @GET("api/portal/my/receipt")// api/portal/my/receipt{?loanProjectName,status,startDate,endDate}
//    Call<RecordsReceivedListData> recordsReceivedListData(@Header("token") String token);
//
//    /**
//     * 富友Android认证支付（调用富友支付之前调用）
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/my/recharge/fuyou-android")
//    Call<FIouPayField> getFIouPayField(@Header("token") String token, @Body HashMap<String, String> hashMap);
//
//    /**
//     * 我的优惠券
//     * */
//    @GET("api/portal/my/coupon/?")//api/portal/my/coupon{?type,specifyClient,status,startDate,endDate}
//    Call<MyCoupon> getMyCoupon(@Header("token") String token,
//                               @Query("type") String type, @Query("status") String status);
//
//    /**
//     * 获取首页Banner数据
//     * */
//    @GET("api/portal/article/category-BANNER/?dedicatedClient=3")//api/portal/article/category-{categoryAlias}{?dedicatedClient}
//    Call<HomeBanner> getHomeBanner();
//    /**
//     * 获取可用优惠券
//     * */
//    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
//    @POST("api/portal/invest/usable-coupons")
//    Call<UsableCoupons> getUsableCoupons(@Header("token") String token, @Body HashMap<String, String> map);
//
//    /**内容相关接口*/
//    /**安卓的dedicatedClient传3*/
//
//    /**
//     * 统一内容获取接口
//     * */
//    @GET("api/portal/article/category-{categoryAlias}/?dedicatedClient=3")// api/portal/article/category-{categoryAlias}{?dedicatedClient}
//    Call<AppOtherContent> getAppOtherContent(@Path("categoryAlias") String categoryAlias);
//
//    /**下面几个接口是统一内容获取接口分开后的写法*/
//    /**
//     * 安全保障
//     * */
//    @GET("api/portal/article/category-SAFETY-SECURITY-ANDROID/?dedicatedClient=3")//api/portal/article/category-{categoryAlias}
//    Call<SafetySecurity> getSafetySecurity();
//
//    /**
//     * 关于我们
//     * */
//    @GET("api/portal/article/category-ABOUT-US-ANDROID/?dedicatedClient=3")//api/portal/article/category-{categoryAlias}{?dedicatedClient}
//    Call<AboutUsData> getAboutUsData();
//
//    /**
//     * 常见问题
//     * */
//    @GET("api/portal/article/category-FREQUENTLY-ASKED-QUE-ANDROID/?dedicatedClient=3")//api/portal/article/category-{categoryAlias}{?dedicatedClient}
//    Call<FreqAskedQue> getFreqAskedQue();
//    /**
//     * 邀请好友
//     * */
//    @GET("api/portal/article/category-INVITE-FRIENDS-ANDROID/?dedicatedClient=3")//api/portal/article/category-{categoryAlias}{?dedicatedClient}
//    Call<InviteFriends> getInviteFriendsData();
//
//    /**
//    * 获取联系我们接口（网站通用数据接口api/portal/sys-param{?category}）
//    * */
//    @GET("api/portal/sys-param?category=WEBSITE_SETTING")//api/portal/sys-param{?category}
//    Call<WebSiteGeneralData> getWebSiteGeneralData();
//
//    /**
//    * 获取文章详情接口
//    * */
//    @GET("api/portal/article/{articleId}")
//    Call<ArticalDetails> getArticalDetails(@Path("articleId") String articleId);
//
//









}

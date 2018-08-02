package com.cirse.mvppt.aother.retrofithttp;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * 注释：
 * ===========================
 * Author by Jack
 */
public class RetrofitClient {
    /**
    * call.enqueue()方法，异步进行网络请求
    * */
    public static void a(Call call, Callback callBack){
        call.enqueue(callBack);
    }

//    /*
//    * call.execute()方法，同步进行网络请求
//    * */
//    public static Object b(Call call, Callback callBack){
//        Response<HomeBannerModle> response;
//        try {
//            response = call.execute();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return response.body();
//    }
}

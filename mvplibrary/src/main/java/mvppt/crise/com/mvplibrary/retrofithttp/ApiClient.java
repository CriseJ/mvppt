package mvppt.crise.com.mvplibrary.retrofithttp;

import java.util.concurrent.TimeUnit;

import mvppt.crise.com.mvplibrary.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 注释：Retrofit网络请求配置类
 * ===========================
 * Author by Jack
 */

public class ApiClient {

    public static Retrofit mRetrofit;
    public static ApiStores apiStores;
    public static ApiStores getInstanceRetrofitApi() {
        if (mRetrofit == null) {
            synchronized (ApiClient.class){
                if (null == mRetrofit){
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();

                    if (BuildConfig.DEBUG) {
                        // Log信息拦截器
                        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                        //设置 Debug Log 模式
                        builder.addInterceptor(loggingInterceptor);
                    }
                    /*
                    * 设置缓存机制
                    * */
//                    File cacheFile = new File(MBaseApplication.getContext().getExternalCacheDir(), ConstFileSavePath.DATA_CACHE_DIR);
//                    Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
//                    Interceptor cacheInterceptor = new Interceptor() {
//                        @Override
//                        public Response intercept(Chain chain) throws IOException {
//                            Request request = chain.request();
//                            if (!NetworkUtils.isConnected()) {
//                                request = request.newBuilder()
//                                        .cacheControl(CacheControl.FORCE_CACHE)
//                                        .build();
//                            }
//                            Response response = chain.proceed(request);
//                            if (!NetworkUtils.isConnected()) {
//                                int maxAge = 0;
//                                // 有网络时 设置缓存超时时间0个小时
//                                response.newBuilder()
//                                        .header("Cache-Control", "public, max-age=" + maxAge)
//                                        .build();
//                            } else {
//                                // 无网络时，设置超时为4周
//                                int maxStale = 60 * 60 * 24 * 28;
//                                response.newBuilder()
//                                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
//                                        .removeHeader("nyn")
//                                        .build();
//                            }
//                            return response;
//                        }
//                    };
//                    builder.cache(cache).addInterceptor(cacheInterceptor);
                    /*
                    * 设置公共参数
                    * */
//                    Interceptor addQueryParameterInterceptor = new Interceptor() {
//                        @Override
//                        public Response intercept(Chain chain) throws IOException {
//                            Request originalRequest = chain.request();
//                            Request request;
//                            String method = originalRequest.method();
//                            Headers headers = originalRequest.headers();
//                            HttpUrl modifiedUrl = originalRequest.url().newBuilder()
//                                    // Provide your custom parameter here
//                                    .addQueryParameter("platform", "android")
//                                    .addQueryParameter("version", "1.0.0")
//                                    .build();
//                            request = originalRequest.newBuilder().url(modifiedUrl).build();
//                            return chain.proceed(request);
//                        }
//                    };
//                    //公共参数
//                    builder.addInterceptor(addQueryParameterInterceptor);
                    /*
                    * 设置头
                    * */
//                    Interceptor headerInterceptor = new Interceptor() {
//                        @Override
//                        public Response intercept(Chain chain) throws IOException {
//                            Request originalRequest = chain.request();
//                            Request.Builder requestBuilder = originalRequest.newBuilder()
//                                    .header("AppType", "TPOS")
//                                    .header("Content-Type", "application/json")
//                                    .header("Accept", "application/json")
//                                    .method(originalRequest.method(), originalRequest.body());
//                            Request request = requestBuilder.build();
//                            return chain.proceed(request);
//                        }
//                    };
//                    //设置头
//                    builder.addInterceptor(headerInterceptor );

                    /*
                    * 设置cookie
                    * */
//                    CookieManager cookieManager = new CookieManager();
//                    cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
//                    builder.cookieJar(new JavaNetCookieJar(cookieManager));
                    /*
                    * 设置超时和重连
                    * */
                    //设置超时
                    builder.connectTimeout(15, TimeUnit.SECONDS);
                    builder.readTimeout(20, TimeUnit.SECONDS);
                    builder.writeTimeout(20, TimeUnit.SECONDS);
                    //错误重连
                    builder.retryOnConnectionFailure(true);
                    //以上设置结束，才能build(),不然设置白搭
                    OkHttpClient okHttpClient = builder.build();
                    mRetrofit = new Retrofit.Builder()
                            .baseUrl(ApiStores.API_SERVER_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(okHttpClient)
                            .build();
            }
            }
        }
        apiStores = mRetrofit.create(ApiStores.class);
        return apiStores;
    }
}

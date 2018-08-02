package com.cirse.mvppt.aother.retrofithttp;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * Created by Ender on 10:39
 */

public abstract class RetrofitCallback<M> implements Callback<M> {
    public abstract void onSuccess(M model);

    public abstract void onFailure(int code, String msg);

    public abstract void onThrowable(Throwable t);

    public abstract void onFinish();

    @Override
    public void onResponse(Call<M> call, Response<M> response) {
        if (response.isSuccessful()) {
            onSuccess(response.body());
        } else {
            ResponseBody responseBody = response.errorBody();
            String message = "";
            try {
                JSONObject jo = new JSONObject(response.errorBody().string());
                message = jo.optString("message");
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            onFailure(response.code(), response.errorBody().toString());
            onFailure(response.code(), message);
        }
        onFinish();
    }

    @Override
    public void onFailure(Call<M> call, Throwable t) {
        onThrowable(t);
        onFinish();
    }
}

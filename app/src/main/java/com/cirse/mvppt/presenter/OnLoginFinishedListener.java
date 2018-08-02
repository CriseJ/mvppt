package com.cirse.mvppt.presenter;

/**
 * 注释：Model层和Presenter层操作的接口
 * ===========================
 * Author by Jack
 * on 2018/8/2 11:23
 */
public interface OnLoginFinishedListener {

    //网络请求返回用户名错误
    void onUserNameError();

    //网络请求返回用户名密码错误
    void onPasswordError();

    //网络请求返回登录成功
    void onSuccess();

}

package com.cirse.mvppt.model;

import com.cirse.mvppt.model.been.User;
import com.cirse.mvppt.presenter.OnLoginFinishedListener;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 11:21
 */
public interface LoginModel {

    void login(User user, OnLoginFinishedListener onLoginFinishedListener);
}

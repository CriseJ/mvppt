package com.cirse.mvppt.View;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 14:36
 */
public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setPasswordError();

    void showSuccess();

}

package mvppt.crise.com.mvplibrary.model;

import mvppt.crise.com.mvplibrary.model.been.User;
import mvppt.crise.com.mvplibrary.presenter.OnLoginFinishedListener;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 11:21
 */
public interface LoginModel {

    void login(User user, OnLoginFinishedListener onLoginFinishedListener);
}

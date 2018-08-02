package com.cirse.mvppt.presenter;

import com.cirse.mvppt.model.been.User;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 14:42
 */
public interface LoginPresenter {

    void validateCredentials(User user);

    void onDestroy();
}

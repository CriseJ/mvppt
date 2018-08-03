package mvppt.crise.com.mvplibrary.presenter;

import mvppt.crise.com.mvplibrary.model.been.User;

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

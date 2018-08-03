package mvppt.crise.com.mvplibrary.presenter;

import mvppt.crise.com.mvplibrary.View.LoginView;
import mvppt.crise.com.mvplibrary.model.LoginModel;
import mvppt.crise.com.mvplibrary.model.been.User;
import mvppt.crise.com.mvplibrary.model.impl.LoginImpl;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 14:42
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {

    private LoginView loginView;//View层接口
    private LoginModel loginModel;//Model层接口

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginImpl();//实现了LoginModel接口
    }

    @Override
    public void validateCredentials(User user) {
        if (loginView != null) {
            loginView.showProgress();
        }
        loginModel.login(user, this);//初始化Model层数据和接口
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUserNameError() {
        if (loginView != null) {
            loginView.setUserNameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.showSuccess();
        }
    }
}

package mvppt.crise.com.mvplibrary.model.impl;

import android.os.Handler;
import android.text.TextUtils;
import mvppt.crise.com.mvplibrary.model.LoginModel;
import mvppt.crise.com.mvplibrary.model.been.User;
import mvppt.crise.com.mvplibrary.presenter.OnLoginFinishedListener;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 11:21
 */
public class LoginImpl implements LoginModel{

    @Override
    public void login(User user, final OnLoginFinishedListener onLoginFinishedListener) {
        final String username = user.getUserName();
        final String password = user.getUserPsd();
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    onLoginFinishedListener.onUserNameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    onLoginFinishedListener.onPasswordError();
                    error = true;
                }
                if (!error){
                    onLoginFinishedListener.onSuccess();
                }
            }
        }, 2000);
    }
}

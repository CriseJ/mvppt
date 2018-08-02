package com.cirse.mvppt.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.cirse.mvppt.R;
import com.cirse.mvppt.model.been.User;
import com.cirse.mvppt.presenter.LoginPresenter;
import com.cirse.mvppt.presenter.LoginPresenterImpl;

/**
* View层的Activity实现View层的接口LoginView，
 * 通过Prsenter层，将数据结果返回给View层接口的各个方法中（接口回调）
* */
public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener{
    private ProgressBar progressBar;
    private LoginPresenter presenter;

    private EditText etUserName;
    private EditText etUserPsd;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = findViewById(R.id.et_userName);
        etUserPsd = findViewById(R.id.et_userPsd);
        btnLogin = findViewById(R.id.btn_login);
        progressBar = findViewById(R.id.pBar_login);
        presenter = new LoginPresenterImpl(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUserNameError() {
        etUserName.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        etUserPsd.setError(getString(R.string.password_error));
    }

    @Override
    public void showSuccess() {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this,"login success",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                User user = new User();
                user.setUserName(etUserName.getText().toString());
                user.setUserPsd(etUserPsd.getText().toString());
                presenter.validateCredentials(user);
                break;
        }
    }
}

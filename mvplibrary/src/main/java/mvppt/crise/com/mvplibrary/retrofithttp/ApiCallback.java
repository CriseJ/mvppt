package mvppt.crise.com.mvplibrary.retrofithttp;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import retrofit2.HttpException;

/**
 * 注释：
 * ===========================
 * Author by Jack
 */

public abstract class ApiCallback<M> extends RetrofitCallback<M>{

    public abstract void onNetException(String msg);
    @Override
    public void onThrowable(Throwable t) {
        if (t instanceof HttpException) {
            HttpException httpException = (HttpException) t;
            int code = httpException.code();
            String msg = httpException.getMessage();
            if (code == 504) {
                msg = "网络不给力";
            }else if (code == 502 || code == 404) {
                msg = "服务器异常，请稍后再试";
            }
            onNetException(msg);
        }else if (t instanceof ConnectException
                || t instanceof SocketTimeoutException){
            //服务器接口连接异常（可能是后台服务器没开，或者接口有问题）
            onNetException("服务器出小差了。。。");
        }
    }

    @Override
    public void onFinish() {

    }
}

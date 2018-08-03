package mvppt.crise.com.mvplibrary.model.been;

/**
 * 注释：登录返回Been
 * ===========================
 * Author by Jack
 * on 2018/4/24 12:18
 */
public class Login {

    /**
     * code : string
     * data : {"token":"string"}
     * httpStatusCode : 0
     * message : string
     * timestamp : 0
     */

    private String code;
    private DataBean data;
    private Double httpStatusCode;
    private String message;
    private Double timestamp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Double getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Double httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    public static class DataBean {
        /**
         * token : string
         */

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}

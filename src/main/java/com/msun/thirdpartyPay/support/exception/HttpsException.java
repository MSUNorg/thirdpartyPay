package com.msun.thirdpartyPay.support.exception;

/**
 * @author zxc Apr 13, 2017 6:13:20 PM
 */
public class HttpsException extends RuntimeException {

    private static final long serialVersionUID = 4704980958987848570L;

    public HttpsException() {
        super();
    }

    public HttpsException(String message) {
        super(message);
    }

    public HttpsException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpsException(Throwable cause) {
        super(cause);
    }

    protected HttpsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

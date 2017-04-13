package com.msun.thirdpartyPay.support.exception;

/**
 * @author zxc Apr 13, 2017 6:13:09 PM
 */
public class HttpException extends RuntimeException {

    private static final long serialVersionUID = -5527348871807480785L;

    public HttpException() {
        super();
    }

    public HttpException(String message) {
        super(message);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpException(Throwable cause) {
        super(cause);
    }

    protected HttpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

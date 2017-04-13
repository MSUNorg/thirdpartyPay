package com.msun.thirdpartyPay.support.exception;

/**
 * @author zxc Apr 13, 2017 6:12:50 PM
 */
public class SecurityException extends RuntimeException {

    private static final long serialVersionUID = 4648941377712398387L;

    public SecurityException() {
        super();
    }

    public SecurityException(String message) {
        super(message);
    }

    public SecurityException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecurityException(Throwable cause) {
        super(cause);
    }

    protected SecurityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

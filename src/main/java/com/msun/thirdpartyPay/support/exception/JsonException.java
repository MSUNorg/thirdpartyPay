package com.msun.thirdpartyPay.support.exception;

/**
 * @author zxc Apr 13, 2017 6:15:35 PM
 */
public class JsonException extends RuntimeException {

    private static final long serialVersionUID = -858977294381235256L;

    public JsonException() {
        super();
    }

    public JsonException(String message) {
        super(message);
    }

    public JsonException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonException(Throwable cause) {
        super(cause);
    }

    protected JsonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

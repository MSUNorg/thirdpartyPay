package com.msun.thirdpartyPay.alipay.exception;

/**
 * @author zxc Apr 13, 2017 6:18:42 PM
 */
public class AliPayException extends RuntimeException {

    private static final long serialVersionUID = -1877159330307741327L;

    public AliPayException() {
        super();
    }

    public AliPayException(String message) {
        super(message);
    }

    public AliPayException(String message, Throwable cause) {
        super(message, cause);
    }

    public AliPayException(Throwable cause) {
        super(cause);
    }

    protected AliPayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

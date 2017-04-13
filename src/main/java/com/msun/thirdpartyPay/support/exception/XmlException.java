package com.msun.thirdpartyPay.support.exception;

/**
 * @author zxc Apr 13, 2017 6:15:35 PM
 */
public class XmlException extends RuntimeException {

    private static final long serialVersionUID = -1276787868790979134L;

    public XmlException() {
        super();
    }

    public XmlException(String message) {
        super(message);
    }

    public XmlException(String message, Throwable cause) {
        super(message, cause);
    }

    public XmlException(Throwable cause) {
        super(cause);
    }

    protected XmlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

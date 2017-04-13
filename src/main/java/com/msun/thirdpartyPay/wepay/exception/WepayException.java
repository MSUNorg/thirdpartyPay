package com.msun.thirdpartyPay.wepay.exception;

/**
 * 微信支付异常
 * 
 * @author zxc Apr 13, 2017 6:42:34 PM
 */
public class WepayException extends RuntimeException {

    private static final long serialVersionUID = 8445615780195056892L;

    /**
     * 当微信发生错误时，对应的错误码
     */
    private String            errorCode;

    /**
     * 当微信发生错误时，对应的错误消息
     */
    private String            errorMsg;

    public WepayException(Throwable cause) {
        super(cause);
    }

    public WepayException(String errorCode, String errorMsg) {
        super("[" + errorCode + "]" + errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}

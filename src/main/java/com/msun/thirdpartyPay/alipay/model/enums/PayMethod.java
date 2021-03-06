package com.msun.thirdpartyPay.alipay.model.enums;

/**
 * 默认支付方式
 * 
 * @author zxc Apr 13, 2017 6:40:01 PM
 */
public enum PayMethod {

    /**
     * 信用支付
     */
    CREDIT_PAY("creditPay"),

    /**
     * 余额支付
     */
    DIRECT_PAY("directPay");

    private String value;

    private PayMethod(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

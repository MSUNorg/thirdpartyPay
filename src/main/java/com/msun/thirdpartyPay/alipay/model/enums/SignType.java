package com.msun.thirdpartyPay.alipay.model.enums;

/**
 * 签名方式
 * 
 * @author zxc Apr 13, 2017 6:40:27 PM
 */
public enum SignType {

    MD5("MD5"),

    DSA("DSA"),

    RSA("RSA");

    private String value;

    private SignType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

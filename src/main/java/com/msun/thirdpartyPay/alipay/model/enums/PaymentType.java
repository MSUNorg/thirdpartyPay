package com.msun.thirdpartyPay.alipay.model.enums;

/**
 * 支付类型
 * 
 * @author zxc Apr 13, 2017 6:39:52 PM
 */
public enum PaymentType {

    /**
     * buy the item
     */
    BUY("1"),

    /**
     * donate
     */
    DONATE("47"),

    /**
     * coupon
     */
    CARD_COUPON("47");

    private String value;

    private PaymentType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

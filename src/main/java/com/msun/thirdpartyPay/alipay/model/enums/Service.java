package com.msun.thirdpartyPay.alipay.model.enums;

/**
 * Service interface
 * 
 * @author zxc Apr 13, 2017 6:40:18 PM
 */
public enum Service {

    /**
     * WEB支付
     */
    WEB_PAY("create_direct_pay_by_user"),

    /**
     * WAP支付
     */
    WAP_PAY("alipay.wap.create.direct.pay.by.user"),

    /**
     * APP支付
     */
    APP_PAY("mobile.securitypay.pay"),

    /**
     * 无密退款
     */
    REFUND_NO_PWD("refund_fastpay_by_platform_nopwd"),

    /**
     * 支付宝通知校验
     */
    NOTIFY_VERIFY("notify_verify");

    private String value;

    private Service(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

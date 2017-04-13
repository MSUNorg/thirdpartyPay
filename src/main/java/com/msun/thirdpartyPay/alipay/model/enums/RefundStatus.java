package com.msun.thirdpartyPay.alipay.model.enums;

/**
 * @author zxc Apr 13, 2017 6:40:11 PM
 */
public enum RefundStatus {

    /**
     * 退款成功: 全额退款情况：trade_status = TRADE_CLOSED，而refund_status=REFUND_SUCCESS； 非全额退款情况：trade_status =
     * TRADE_SUCCESS，而refund_status=REFUND_SUCCESS
     */
    REFUND_SUCCESS("REFUND_SUCCESS"),

    /**
     * 退款关闭
     */
    REFUND_CLOSED("REFUND_CLOSED");

    private String value;

    private RefundStatus(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

package com.msun.thirdpartyPay.wepay.model.enums;

/**
 * 交易状态
 * 
 * @author zxc Apr 13, 2017 6:44:35 PM
 */
public enum TradeState {

    /**
     * 支付成功
     */
    SUCCESS("SUCCESS"),

    /**
     * 转入退款
     */
    REFUND("REFUND"),

    /**
     * 未支付
     */
    NOTPAY("NOTPAY"),

    /**
     * 已关闭
     */
    CLOSED("CLOSED"),

    /**
     * 已撤销（刷卡支付）
     */
    REVOKED("REVOKED"),

    /**
     * 已撤销（刷卡支付）
     */
    USERPAYING("USERPAYING"),

    /**
     * 支付失败(其他原因，如银行返回失败)
     */
    PAYERROR("PAYERROR");

    private String type;

    private TradeState(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }

    public static TradeState from(String s) {
        for (TradeState tt : TradeState.values()) {
            if (tt.type().equals(s)) {
                return tt;
            }
        }
        throw new IllegalArgumentException("unknown trade type: " + s);
    }
}

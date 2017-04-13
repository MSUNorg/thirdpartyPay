package com.msun.thirdpartyPay.wepay.model.enums;

/**
 * 货币类型
 * 
 * @author zxc Apr 13, 2017 6:44:14 PM
 */
public enum FeeType {

    /**
     * 人民币
     */
    CNY("CNY");

    private String type;

    private FeeType(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }

    public static FeeType from(String t) {
        for (FeeType ft : FeeType.values()) {
            if (ft.type().equals(t)) {
                return ft;
            }
        }
        throw new IllegalArgumentException("unknown fee type: " + t);
    }
}

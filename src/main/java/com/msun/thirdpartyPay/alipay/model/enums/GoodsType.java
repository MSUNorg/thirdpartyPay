package com.msun.thirdpartyPay.alipay.model.enums;

/**
 * 商品类型
 * 
 * @author zxc Apr 13, 2017 6:39:42 PM
 */
public enum GoodsType {

    /**
     * 虚拟物品
     */
    VIRTUAL("0"),

    /**
     * 实物
     */
    REAL("1");

    private String value;

    private GoodsType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

package com.msun.thirdpartyPay.wepay.annotation;

/**
 * 标记字段是可选的
 * 
 * @author zxc Apr 13, 2017 6:38:13 PM
 */
public @interface WepayOptional {

    /**
     * 是否任何情况下都可选
     * 
     * @return optional or not
     */
    boolean any() default true;
}

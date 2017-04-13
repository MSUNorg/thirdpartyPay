package com.msun.thirdpartyPay.wepay.model.pay;

import com.msun.thirdpartyPay.wepay.annotation.WepayOptional;

/**
 * 二维码支付请求对象
 * 
 * @author zxc Apr 13, 2017 6:45:40 PM
 */
public class QrPayRequest extends PayRequest {

    private static final long serialVersionUID = -4991817824772641424L;
    /**
     * 商品ID {@link me.hao0.wepay.model.enums.WepayField#PRODUCT_ID}
     */
    @WepayOptional(any = false)
    private String            productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "QrPayRequest{" + "productId='" + productId + '\'' + "} " + super.toString();
    }
}

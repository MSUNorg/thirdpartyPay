package com.msun.thirdpartyPay.wepay.model.pay;

/**
 * JS支付请求对象
 * 
 * @author zxc Apr 13, 2017 6:45:15 PM
 */
public class JsPayRequest extends PayRequest {

    private static final long serialVersionUID = 8394359425337364208L;
    /**
     * 用户标识 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#OPEN_ID}
     */
    private String            openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    public String toString() {
        return "JsPayRequest{" + "openId='" + openId + '\'' + "} " + super.toString();
    }
}

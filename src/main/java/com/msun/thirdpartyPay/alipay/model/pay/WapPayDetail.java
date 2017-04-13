package com.msun.thirdpartyPay.alipay.model.pay;

import com.msun.thirdpartyPay.alipay.annotation.AlipayOptional;

/**
 * 支付宝WAP支付明细
 * 
 * @author zxc Apr 13, 2017 6:41:14 PM
 */
public class WapPayDetail extends PayDetail {

    private static final long serialVersionUID = -4046847553452516114L;

    /**
     * 商品展示网址 {@link me.hao0.alipay.model.enums.AlipayField#SHOW_URL}
     */
    @AlipayOptional
    private String            showUrl;

    /**
     * 手机支付宝token {@link me.hao0.alipay.model.enums.AlipayField#EXTERN_TOKEN}
     */
    @AlipayOptional
    private String            externToken;

    /**
     * 航旅订单其它费用 {@link me.hao0.alipay.model.enums.AlipayField#OTHER_FEE}
     */
    @AlipayOptional
    private String            otherFee;

    /**
     * 航旅订单金额 {@link me.hao0.alipay.model.enums.AlipayField#AIR_TICKET}
     */
    @AlipayOptional
    private String            airTicket;

    /**
     * 是否发起实名校验 {@link me.hao0.alipay.model.enums.AlipayField#RN_CHECK}
     */
    @AlipayOptional
    private String            rnCheck;

    /**
     * 买家证件号码 {@link me.hao0.alipay.model.enums.AlipayField#BUYER_CERT_NO}
     */
    @AlipayOptional
    private String            buyerCertNo;

    /**
     * 买家真实姓名 {@link me.hao0.alipay.model.enums.AlipayField#BUYER_REAL_NAME}
     */
    @AlipayOptional
    private String            buyerRealName;

    /**
     * 收单场景 {@link me.hao0.alipay.model.enums.AlipayField#SCENE}
     */
    @AlipayOptional
    private String            scene;

    public WapPayDetail(String outTradeNo, String orderName, String totalFee) {
        super(outTradeNo, orderName, totalFee);
    }

    public String getShowUrl() {
        return showUrl;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    public String getExternToken() {
        return externToken;
    }

    public void setExternToken(String externToken) {
        this.externToken = externToken;
    }

    public String getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(String otherFee) {
        this.otherFee = otherFee;
    }

    public String getAirTicket() {
        return airTicket;
    }

    public void setAirTicket(String airTicket) {
        this.airTicket = airTicket;
    }

    public String getRnCheck() {
        return rnCheck;
    }

    public void setRnCheck(String rnCheck) {
        this.rnCheck = rnCheck;
    }

    public String getBuyerCertNo() {
        return buyerCertNo;
    }

    public void setBuyerCertNo(String buyerCertNo) {
        this.buyerCertNo = buyerCertNo;
    }

    public String getBuyerRealName() {
        return buyerRealName;
    }

    public void setBuyerRealName(String buyerRealName) {
        this.buyerRealName = buyerRealName;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    @Override
    public String toString() {
        return "WapPayFields{" + "showUrl='" + showUrl + '\'' + ", externToken='" + externToken + '\'' + ", otherFee='" + otherFee + '\'' + ", airTicket='" + airTicket + '\'' + ", rnCheck='" + rnCheck + '\''
               + ", buyerCertNo='" + buyerCertNo + '\'' + ", buyerRealName='" + buyerRealName + '\'' + ", scene='" + scene + '\'' + "} " + super.toString();
    }
}

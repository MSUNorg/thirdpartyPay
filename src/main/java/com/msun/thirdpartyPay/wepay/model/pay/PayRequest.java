package com.msun.thirdpartyPay.wepay.model.pay;

import java.io.Serializable;

import com.msun.thirdpartyPay.wepay.annotation.WepayOptional;
import com.msun.thirdpartyPay.wepay.model.enums.FeeType;

/**
 * 支付请求对象
 * 
 * @author zxc Apr 13, 2017 6:45:31 PM
 */
public class PayRequest implements Serializable {

    private static final long serialVersionUID = 2219327746650221239L;

    /**
     * 商品描述 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#BODY}
     */
    private String            body;

    /**
     * 业务系统唯一订单号 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#OUT_TRADE_NO}
     */
    private String            outTradeNo;

    /**
     * 总金额(分) {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#TOTAL_FEE}
     */
    private Integer           totalFee;

    /**
     * 客户端IP {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#SPBILL_CREATE_IP}
     */
    private String            clientId;

    /**
     * 通知URL {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#NOTIFY_URL}
     */
    private String            notifyUrl;

    /**
     * 设备号 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#DEVICE_INFO}
     */
    @WepayOptional
    private String            deviceInfo;

    /**
     * 附加信息 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#ATTACH}
     */
    @WepayOptional
    private String            attach;

    /**
     * 商品详情 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#DETAIL}
     */
    @WepayOptional
    private String            detail;

    /**
     * 货币类型 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#FEE_TYPE}
     */
    private FeeType           feeType          = FeeType.CNY;

    /**
     * 交易开始时间 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#TIME_START}
     */
    private String            timeStart;

    /**
     * 交易结束时间 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#TIME_EXPIRE}
     */
    @WepayOptional
    private String            timeExpire;

    /**
     * 商品标记 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#GOODS_TAG}
     */
    @WepayOptional
    private String            goodsTag;

    /**
     * 指定支付方式 {@link com.msun.thirdpartyPay.wepay.model.enums.WepayField#LIMIT_PAY}
     */
    @WepayOptional
    private String            limitPay;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    @Override
    public String toString() {
        return "PayDetail{" + "body='" + body + '\'' + ", outTradeNo='" + outTradeNo + '\'' + ", totalFee=" + totalFee + ", clientId='" + clientId + '\'' + ", notifyUrl='" + notifyUrl + '\'' + ", deviceInfo='"
               + deviceInfo + '\'' + ", attach='" + attach + '\'' + ", detail='" + detail + '\'' + ", feeType=" + feeType + ", timeStart='" + timeStart + '\'' + ", timeExpire='" + timeExpire + '\'' + ", goodsTag='"
               + goodsTag + '\'' + ", limitPay='" + limitPay + '\'' + '}';
    }
}

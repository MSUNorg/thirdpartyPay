package com.msun.thirdpartyPay.wepay.model.bill;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.msun.thirdpartyPay.wepay.model.enums.WepayField;

/**
 * 账单统计
 * 
 * @author zxc Apr 13, 2017 6:42:52 PM
 */
public class BillCount implements Serializable {

    private static final long serialVersionUID = 2827339255910413151L;

    /**
     * 总交易笔数
     */
    @JsonProperty(WepayField.TRADE_TOTAL_COUNT)
    private Integer           tradeTotalCount;

    /**
     * 总交易额(元)
     */
    @JsonProperty(WepayField.TRADE_TOTAL_FEE)
    private Float             tradeTotalFee;

    /**
     * 总退款金额(元)
     */
    @JsonProperty(WepayField.REFUND_TOTAL_FEE)
    private Float             refundTotalFee;

    /**
     * 总代金券或立减优惠退款金额
     */
    @JsonProperty(WepayField.COUPON_REFUND_TOTAL_FEE)
    private Float             couponRefundTotalFee;

    /**
     * 手续费总金额
     */
    @JsonProperty(WepayField.COMMISSION_TOTAL_FEE)
    private String            commissionTotalFee;

    public Integer getTradeTotalCount() {
        return tradeTotalCount;
    }

    public void setTradeTotalCount(Integer tradeTotalCount) {
        this.tradeTotalCount = tradeTotalCount;
    }

    public Float getTradeTotalFee() {
        return tradeTotalFee;
    }

    public void setTradeTotalFee(Float tradeTotalFee) {
        this.tradeTotalFee = tradeTotalFee;
    }

    public Float getRefundTotalFee() {
        return refundTotalFee;
    }

    public void setRefundTotalFee(Float refundTotalFee) {
        this.refundTotalFee = refundTotalFee;
    }

    public Float getCouponRefundTotalFee() {
        return couponRefundTotalFee;
    }

    public void setCouponRefundTotalFee(Float couponRefundTotalFee) {
        this.couponRefundTotalFee = couponRefundTotalFee;
    }

    public String getCommissionTotalFee() {
        return commissionTotalFee;
    }

    public void setCommissionTotalFee(String commissionTotalFee) {
        this.commissionTotalFee = commissionTotalFee;
    }

    @Override
    public String toString() {
        return "BillCount{" + "tradeTotalCount=" + tradeTotalCount + ", tradeTotalFee=" + tradeTotalFee + ", refundTotalFee=" + refundTotalFee + ", couponRefundTotalFee=" + couponRefundTotalFee + ", commissionTotalFee="
               + commissionTotalFee + '}';
    }
}

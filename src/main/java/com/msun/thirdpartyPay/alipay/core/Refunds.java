package com.msun.thirdpartyPay.alipay.core;

import static com.msun.thirdpartyPay.support.util.Preconditions.checkNotNullAndEmpty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.msun.thirdpartyPay.alipay.exception.AliPayException;
import com.msun.thirdpartyPay.alipay.model.enums.AlipayField;
import com.msun.thirdpartyPay.alipay.model.enums.Service;
import com.msun.thirdpartyPay.alipay.model.refund.RefundDetail;
import com.msun.thirdpartyPay.alipay.model.refund.RefundDetailData;
import com.msun.thirdpartyPay.support.date.Dates;
import com.msun.thirdpartyPay.support.exception.XmlException;
import com.msun.thirdpartyPay.support.http.Http;
import com.msun.thirdpartyPay.support.util.Strings;
import com.msun.thirdpartyPay.support.xml.XmlReaders;

/**
 * 退款组件
 * 
 * @author zxc Apr 13, 2017 6:39:13 PM
 */
public class Refunds extends Component {

    Refunds(Alipay alipay) {
        super(alipay);
    }

    /**
     * 发起退款请求
     * 
     * @param refundDetail 退款明细
     * @return 退款是否提交成功(不表示实际退款是否, 需从支付宝退款通知中来确认)
     */
    public Boolean refund(RefundDetail refundDetail) {
        try {
            String url = Alipay.GATEWAY + "_input_charset=" + alipay.inputCharset;
            Map<String, String> refundParams = buildRefundParams(refundDetail);
            String resp = Http.get(url).params(refundParams).request();
            XmlReaders reader = XmlReaders.create(resp);
            String isSuccess = reader.getNodeStr("is_success");
            if ("T".equals(isSuccess)) {
                return Boolean.TRUE;
            }
        } catch (XmlException e) {
            // ignore xml parse error
        } catch (Exception e) {
            throw new AliPayException(e);
        }
        return Boolean.FALSE;
    }

    private Map<String, String> buildRefundParams(RefundDetail refundDetail) {

        Map<String, String> refundParams = new HashMap<>();

        // 配置参数
        refundParams.putAll(alipay.refundConfig);

        // 接口名
        refundParams.put(AlipayField.SERVICE.field(), Service.REFUND_NO_PWD.value());

        if (!Strings.isNullOrEmpty(alipay.email)) {
            refundParams.put(AlipayField.SELLER_EMAIL.field(), alipay.email);
        }

        // 通知URL
        if (!Strings.isNullOrEmpty(refundDetail.getNotifyUrl())) {
            refundParams.put(AlipayField.NOTIFY_URL.field(), refundDetail.getNotifyUrl());
        }

        // 卖家ID
        refundParams.put(AlipayField.SELLER_USER_ID.field(), alipay.merchantId);

        // 退款日期
        refundParams.put(AlipayField.REFUND_DATE.field(), Dates.now("yyyy-MM-dd HH:mm:ss"));

        // 退款批次号
        checkNotNullAndEmpty(refundDetail.getBatchNo(), "batchNo");
        refundParams.put(AlipayField.BATCH_NO.field(), refundDetail.getBatchNo());

        // 退款明细
        List<RefundDetailData> detailDatas = refundDetail.getDetailDatas();
        checkNotNullAndEmpty(detailDatas, "detail datas");
        refundParams.put(AlipayField.BATCH_NUM.field(), Integer.toString(detailDatas.size()));
        refundParams.put(AlipayField.DETAIL_DATA.field(), refundDetail.formatDetailDatas());

        // md5签名参数
        buildMd5SignParams(refundParams);

        return refundParams;
    }
}

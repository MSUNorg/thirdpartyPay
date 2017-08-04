/*
 * Copyright 2015-2020 uuzu.com All right reserved.
 */
package pay;

import com.msun.thirdpartyPay.support.date.Dates;
import com.msun.thirdpartyPay.wepay.core.Wepay;
import com.msun.thirdpartyPay.wepay.core.WepayBuilder;
import com.msun.thirdpartyPay.wepay.model.pay.QrPayRequest;

/**
 * @author zxc Aug 3, 2017 10:05:13 PM
 */
public class WepayTest {

    private static Wepay  wepay;
    private static String callback_url = "/giveme/payresult/wxpay";
    private static String ORDER_NAME   = "[小虫测评]%s购买点卡%s元";
    private static String requestIp    = "101.201.147.63";
    static {
        wepay = WepayBuilder.newBuilder("wx605cd611b3fd9d7e", "LuH12uang7zh9k82un19ang3a8i7XC16", "1471094702").build();
    }

    public static void main(String[] args) {
        String orderName = String.format(ORDER_NAME, "zxc", 0.01);
        String outTradeNo = "comexue_1889";
        QrPayRequest request = new QrPayRequest();
        request.setBody(orderName);
        request.setClientId(requestIp);
        request.setTotalFee(1);
        request.setNotifyUrl(callback_url);
        request.setOutTradeNo(outTradeNo);
        request.setTimeStart(Dates.now("yyyyMMddHHmmss"));
        Object resp = wepay.pay().qrPay(request);
        System.out.println(resp);
    }
}

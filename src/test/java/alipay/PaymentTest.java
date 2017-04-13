/*
 * Copyright 2015-2020 msun.com All right reserved.
 */
package alipay;

import java.util.Properties;

import com.msun.thirdpartyPay.alipay.core.Alipay;
import com.msun.thirdpartyPay.alipay.core.AlipayBuilder;

/**
 * @author zxc Aug 14, 2016 3:21:42 PM
 */
public class PaymentTest {

    @SuppressWarnings("unused")
    private static Alipay alipay;

    static {
        try {
            Properties prop = new Properties();
            prop.load(PaymentTest.class.getClassLoader().getResourceAsStream("alipay.properties"));
            String merchantId = prop.getProperty("merchantId");
            String secret = prop.getProperty("secret");
            String prikey = prop.getProperty("prikey");
            String pubkey = prop.getProperty("pubkey");
            alipay = AlipayBuilder.newBuilder(merchantId, secret).appPriKey(prikey).appPubKey(pubkey).build();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        // AppPayDetail fields = new AppPayDetail("DM1234567779", "ss", "0.01", "测试商品");
        // fields.setGoodsType(GoodsType.VIRTUAL);
        // String payString = alipay.pay().appPay(fields);
        // System.out.println(payString);

        String totalFee = (double) (Math.round(100) / 100.0) + "";
        System.out.println(totalFee);
    }
}

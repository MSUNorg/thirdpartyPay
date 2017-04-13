package com.msun.thirdpartyPay.wepay.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.msun.thirdpartyPay.support.util.Strings;
import com.msun.thirdpartyPay.wepay.model.enums.RefundChannel;

/**
 * 退款渠道反序列化器
 * 
 * @author zxc Apr 13, 2017 6:47:41 PM
 */
public class RefundChannelDeserializer extends JsonDeserializer<RefundChannel> {

    @Override
    public RefundChannel deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        String val = jp.getValueAsString();
        if (Strings.isNullOrEmpty(val)) {
            return null;
        }
        return RefundChannel.from(val);
    }
}

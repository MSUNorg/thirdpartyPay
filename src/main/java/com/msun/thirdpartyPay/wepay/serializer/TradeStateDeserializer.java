package com.msun.thirdpartyPay.wepay.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.msun.thirdpartyPay.wepay.model.enums.TradeState;

/**
 * 交易状态反序列化器
 * 
 * @author zxc Apr 13, 2017 6:47:48 PM
 */
public class TradeStateDeserializer extends JsonDeserializer<TradeState> {

    @Override
    public TradeState deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return TradeState.from(jp.getValueAsString());
    }
}

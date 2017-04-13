package com.msun.thirdpartyPay.wepay.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.msun.thirdpartyPay.wepay.model.enums.FeeType;

/**
 * 交易类型反序列化器
 * 
 * @author zxc Apr 13, 2017 6:47:34 PM
 */
public class FeeTypeDeserializer extends JsonDeserializer<FeeType> {

    @Override
    public FeeType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return FeeType.from(jp.getValueAsString());
    }
}

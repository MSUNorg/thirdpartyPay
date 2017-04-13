package com.msun.thirdpartyPay.wepay.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * 布尔反序列化器
 * 
 * @author zxc Apr 13, 2017 6:47:09 PM
 */
public class BooleanDeserializer extends JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        String r = jp.getValueAsString();
        return "Y".equals(r);
    }
}

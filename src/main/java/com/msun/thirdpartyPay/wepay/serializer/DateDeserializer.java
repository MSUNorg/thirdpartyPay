package com.msun.thirdpartyPay.wepay.serializer;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.msun.thirdpartyPay.support.date.Dates;

/**
 * 日期反序列化器
 * 
 * @author zxc Apr 13, 2017 6:47:16 PM
 */
public class DateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        return Dates.toDate(parser.getValueAsString(), "yyyyMMddHHmmss");
    }
}

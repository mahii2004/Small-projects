package com.mahi.springboot.Service;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.io.InputStream;

@JsonComponent
public class ByteArrayInputStreamSerializer extends JsonSerializer<InputStream> {

    @Override
    public void serialize(InputStream value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        // Here, you can implement the logic to serialize the InputStream to JSON
        // For example, you can convert it to a byte array or a base64 string
        // For demonstration, let's assume we're converting it to a byte array
        byte[] byteArray = value.readAllBytes();
        gen.writeBinary(byteArray);
    }
}


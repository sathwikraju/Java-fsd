package com.ecommerce;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class PlainTextHttpMessageConverter implements HttpMessageConverter<String> {

    private MappingJackson2HttpMessageConverter jsonConverter;

    public PlainTextHttpMessageConverter() {
        this.jsonConverter = new MappingJackson2HttpMessageConverter();
        List<MediaType> mediaTypes = Collections.singletonList(MediaType.TEXT_PLAIN);
        this.jsonConverter.setSupportedMediaTypes(mediaTypes);
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return jsonConverter.canRead(clazz, mediaType);
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return jsonConverter.canWrite(clazz, mediaType);
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return jsonConverter.getSupportedMediaTypes();
    }

    @Override
    public String read(Class<? extends String> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return StreamUtils.copyToString(inputMessage.getBody(), StandardCharsets.UTF_8);
    }

    @Override
    public void write(String s, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        jsonConverter.write(s, contentType, outputMessage);
    }

    public String getNullableResultType() {
        return null;
    }
}

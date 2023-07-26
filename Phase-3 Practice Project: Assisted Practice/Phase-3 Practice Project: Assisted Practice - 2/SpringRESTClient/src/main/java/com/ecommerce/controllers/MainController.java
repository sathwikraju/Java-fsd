package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.beans.Quote;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("https://type.fit/api/quotes", String.class);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Quote> quotes = objectMapper.readValue(response, new TypeReference<List<Quote>>() {});
            
            StringBuilder result = new StringBuilder();
            for (Quote quote : quotes) {
                result.append(quote.toString()).append("\n");
            }
            return result.toString();
        } catch (IOException e) {
            return "Error occurred while processing the response.";
        }
    }
}

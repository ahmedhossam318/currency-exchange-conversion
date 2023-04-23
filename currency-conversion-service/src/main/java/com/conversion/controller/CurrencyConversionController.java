package com.conversion.controller;

import com.conversion.model.CurrencyConversion;
import com.conversion.proxy.CurrencyConversionProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;

@RestController
public class CurrencyConversionController {
    @Autowired
    private CurrencyConversionProxy proxy;
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity)
    {
        HashMap<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to",to);
        String url = "http://localhost:8000/currency/from/{from}/to/{to}";
        ResponseEntity<CurrencyConversion> response =  new  RestTemplate().getForEntity(url,CurrencyConversion.class,uriVariables);
        CurrencyConversion conversion = response.getBody();
        return new CurrencyConversion(conversion.getId(),from,to,quantity,
                conversion.getConversionMultiple(),
                quantity.multiply(conversion.getConversionMultiple()),conversion.getEnvironment());
    }
    @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyFeign(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity)
    {
        HashMap<String, Object> uriVariables = new HashMap<>();

        CurrencyConversion conversion = proxy.retrieveExchangeValue(from, to);
        return new CurrencyConversion(conversion.getId(),from,to,quantity,
                conversion.getConversionMultiple(),
                quantity.multiply(conversion.getConversionMultiple()),conversion.getEnvironment());
    }
}

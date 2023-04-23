package com.conversion.proxy;

import com.conversion.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange",url = "http://localhost:8000")
@FeignClient(name = "currency-exchange")
public interface CurrencyConversionProxy {

    @GetMapping("/currency/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}

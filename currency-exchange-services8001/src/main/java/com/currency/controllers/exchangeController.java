package com.currency.controllers;

import com.currency.models.CurrencyExchange;
import com.currency.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class exchangeController {

    @Autowired
    private CurrencyExchangeRepository repository;
    @Autowired
    private Environment environment;
    @GetMapping("/currency/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from ,
            @PathVariable String to
    )
    {
        CurrencyExchange  exchange = repository.findCurrencyExchangeByFromAndTo(from,to);
        if (Objects.isNull(exchange))
            throw new RuntimeException("Couldn't find exchange from  " + from + "to " + to);
        String port = environment.getProperty("local.server.port");
        exchange.setEnvironment(port);
//        return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50),port);
        return exchange;
    }
}

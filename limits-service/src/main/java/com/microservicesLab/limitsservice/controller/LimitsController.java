package com.microservicesLab.limitsservice.controller;

import com.microservicesLab.limitsservice.models.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesLab.limitsservice.configuration.Configuration;
@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits getLimit()
    {
//        return new Limits(1,2);
          return new Limits(configuration.getMin() , configuration.getMax());
    }
}

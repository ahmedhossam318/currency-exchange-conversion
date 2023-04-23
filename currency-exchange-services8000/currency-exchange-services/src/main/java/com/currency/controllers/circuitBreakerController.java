package com.currency.controllers;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class circuitBreakerController {
    @GetMapping("/sample-api")
//    @Retry(name = "sample-api" ,fallbackMethod = "hardCodedResponse")
//    @CircuitBreaker(name = "default" ,fallbackMethod = "hardCodedResponse")
    @RateLimiter(name = "default")
//    @Bulkhead(name ="sample-api" )
    public String sampleApi()
    {
//        log.info("Sample API is retry circuit Breaker");
//        ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:8080/url-dummy", String.class);
//        return response.getBody();
          return "sample-API";
    }
    public String hardCodedResponse(Exception e)
    {
        return "fallback response";
    }
}

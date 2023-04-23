package com.microservicesLab.limitsservice.configuration;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int min;
    private int max;

}

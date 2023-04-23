package com.microservicesLab.limitsservice.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Limits {
    private int min;
    private int max;
}

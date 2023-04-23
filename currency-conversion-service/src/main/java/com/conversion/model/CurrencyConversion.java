package com.conversion.model;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculateAmount;
    private String environment;

    public CurrencyConversion(Long id, String from, String to, BigDecimal quantity) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
    }
}

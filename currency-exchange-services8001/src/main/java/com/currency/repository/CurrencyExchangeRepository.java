package com.currency.repository;

import com.currency.models.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findCurrencyExchangeByFromAndTo(String from, String to);
}

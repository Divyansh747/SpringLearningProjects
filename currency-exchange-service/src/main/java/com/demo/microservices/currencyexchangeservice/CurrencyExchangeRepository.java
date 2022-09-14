package com.demo.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.microservices.currencyexchangeservice.controller.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

	CurrencyExchange findByFromAndTo(String from, String to);
}

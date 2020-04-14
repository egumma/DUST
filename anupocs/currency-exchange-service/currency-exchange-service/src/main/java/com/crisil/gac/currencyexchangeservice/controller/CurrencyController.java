package com.crisil.gac.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crisil.gac.currencyexchangeservice.beans.ExchangeValue;
import com.crisil.gac.currencyexchangeservice.config.EnvironmentConfigs;

@RestController
public class CurrencyController {
	
	@Autowired
	EnvironmentConfigs environmentConfigs;
	
	@GetMapping("/exchangeValue/from/{from}/to/{to}")
	public ExchangeValue returnExchangevalue(@PathVariable String from,@PathVariable String to) {
		return new ExchangeValue(142L,from,to,BigDecimal.valueOf(100L),environmentConfigs.getPort());
	}

}

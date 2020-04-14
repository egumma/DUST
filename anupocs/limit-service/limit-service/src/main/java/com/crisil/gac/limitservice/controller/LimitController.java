package com.crisil.gac.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisil.gac.limitservice.bean.Limits;
import com.crisil.gac.limitservice.config.LimitConfig;

@RestController
public class LimitController {

	@Autowired
    LimitConfig limitConfig;
	
	@GetMapping("/limits")
	public Limits greeting() {
		System.out.println("name================>");

		return new Limits(limitConfig.getMinNumber(),limitConfig.getMaxNumber());
	}
}

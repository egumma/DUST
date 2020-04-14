package com.crisil.gac.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitConfig {

	
	private int minNumber;
	private int maxNumber;
	public int getMinNumber() {
		return minNumber;
	}
	public void setMinNumber(int minNumber) {
		this.minNumber = minNumber;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
}

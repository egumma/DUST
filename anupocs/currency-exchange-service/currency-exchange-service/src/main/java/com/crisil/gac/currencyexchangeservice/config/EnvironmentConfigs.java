package com.crisil.gac.currencyexchangeservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class EnvironmentConfigs {
	
	private int port;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public EnvironmentConfigs(int port) {
		
		this.port = port;
	}

	public EnvironmentConfigs() {
		
	}

	
}

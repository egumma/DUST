package com.crisil.gac.currencyexchangeservice.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="exchange_value")
public class ExchangeValue {
    
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
    @Column(name="currency_to")
	private String to;
    @Column(name="converstion_Multiple")
	private BigDecimal converstionMultiple;
	private int port;
	public Long getId() {
		return id;
	}
public ExchangeValue() {
		
		
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal converstionMultiple,int port) {
		
		this.id = id;
		this.from = from;
		this.to = to;
		this.converstionMultiple = converstionMultiple;
		this.port=port;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConverstionMultiple() {
		return converstionMultiple;
	}
	public void setConverstionMultiple(BigDecimal converstionMultiple) {
		this.converstionMultiple = converstionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}

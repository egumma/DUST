package com.crisil.gac.limitservice.bean;

public class Limits {
	
	private int minNumber;
	private int maxNumber;
	public int getMinNumber() {
		return minNumber;
	}
	public Limits(int minNumber, int maxNumber) {
		
		this.minNumber = minNumber;
		this.maxNumber = maxNumber;
	}
	
public Limits() {
		
		
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

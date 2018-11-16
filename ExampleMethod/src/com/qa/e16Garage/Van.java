package com.qa.e16Garage;

class Van extends Vehicle{

	private String bootsize;

	Van(String bootsize, String maker, String license) {
		super(maker,license);
		this.bootsize = bootsize;
	}
	
	public String getBootsize() {
		return bootsize;
	}

	public void setBootsize(String bootsize) {
		this.bootsize = bootsize;
	}
	
}
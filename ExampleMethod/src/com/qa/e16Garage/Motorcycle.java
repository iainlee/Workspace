package com.qa.e16Garage;

class Motorcycle extends Vehicle{
	
	private int ccs;

	Motorcycle(int ccs, String maker, String license) {
		super(maker,license);
		this.ccs = ccs;
	}
	
	public int getCcs() {
		return ccs;
	}

	public void setCcs(int ccs) {
		this.ccs = ccs;
	}
	
}
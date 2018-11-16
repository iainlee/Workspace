package com.qa.e16Garage;

public class Vehicle {

	protected String maker;
	protected String license;
	
	Vehicle (String maker, String license)
	{
		this.maker=maker;
		this.license=license;
	}
	
	public String getMaker() {
		return maker;
	}
	public void setmaker(String maker) {
		this.maker = maker;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
}
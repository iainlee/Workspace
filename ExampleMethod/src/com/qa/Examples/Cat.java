package com.qa.Examples;

class Cat extends Mammal{

	private String size;
	
	Cat (String size, String speak, boolean tail)
	{
		super(speak,tail);
		this.size=size;
	}
	
	String getSize(){
		return size;
	}
	
	public String ToString() {
		return "Kitty Kitty Bang Bang";
	}
	
}
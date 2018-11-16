package com.qa.Examples;

class Mammal extends Animal{

	private String speak;
	
	Mammal (String speak, boolean tail)
	{
		//super = send this thing to the class I extend from. Why am I sending tail?
		super(tail);
		this.speak=speak;
		
	}
	
	public String getSpeak(){
		return speak;
	}
	
}
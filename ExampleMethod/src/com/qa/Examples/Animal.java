package com.qa.Examples;

//abstract class, so you can't create an instance of it alone
abstract class Animal {

	//public abstract makeNoise();
	private boolean tail;
	
	Animal (boolean tail)
	{
		this.tail=tail;
	}
	
	public boolean getTail()
	{
		return tail;
	}
	
}
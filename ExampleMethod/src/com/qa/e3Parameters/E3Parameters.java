package com.qa.e3Parameters;

public class E3Parameters {

	static String greeting = "hello";
	
	public static void main(String[] args) {
		
		Outputter(greeting);
		
}
	
	public static void Outputter(String hello) {
		  
		System.out.println(greeting);
		return;
		
		 }

	}

//PARAMETERS
//Create a method that accepts a string as a parameter, and then outputs that string
//to the console via a System.out.println(), then call that method from your
//main method.
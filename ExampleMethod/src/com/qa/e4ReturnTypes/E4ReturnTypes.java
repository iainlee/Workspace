package com.qa.e4ReturnTypes;

public class E4ReturnTypes {

	static String hello = "";
	
	public static void main(String[] args) {
		
		Outputter();
		System.out.println(hello);
		
}
	
	public static String Outputter() {
		  
		hello = "Hello World!";
		return hello;
		
		 }

	}

//RETURN TYPES
//Create a method to return “Hello World!” once called, which you call from your
//main method, to then output the text to the screen.
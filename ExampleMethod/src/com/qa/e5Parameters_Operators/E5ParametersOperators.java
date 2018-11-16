package com.qa.e5Parameters_Operators;

public class E5ParametersOperators {

	static int num1 = 20;
	static int num2 = 40;
	static int num3;
	
	public static void main(String[] args) {
		
		combiner (num1, num2);
		System.out.println(num3);

	}

	static int combiner(int num1, int num2)
	{
		num3 = num1 + num2;
		return num3;
		
	}
	
}

//PARAMETERS/OPERATORS
//Create a method that accepts two integers as parameters, then returns an integer
//that is a sum of the two integers given, then call this method from your main method
//and output the returned result.
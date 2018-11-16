package com.qa.e6Conditionals;

public class E6Conditionals {

	public int combiner(int num1, int num2, boolean modifier) {
		if (!modifier)
			return num1 + num2;
		else
			return num1 * num2;
	}

}
/*
 * Modify your method from the previous task to accept another parameter, a
 * Boolean, which if it is true, the method will return a sum of the two
 * numbers, and if it is false it will return the multiplication of the two
 * numbers.
 */
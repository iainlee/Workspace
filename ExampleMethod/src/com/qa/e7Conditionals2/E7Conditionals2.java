package com.qa.e7Conditionals2;

public class E7Conditionals2 {

	public int combiner(int num1, int num2, boolean modifier)
	{
		if (num1==0)
		{
			return num2;
		}
		
		else if (num2==0)
		{
			return num1;
		}
		
		else
		{
			if (!modifier)
				return num1 * num2;
			else
				return num1 + num2;
		}

	}
}
/*Modify your method from the previous task to have another if statement that checks
if one of the numbers is 0, if this is true then return the other non-0 number.*/
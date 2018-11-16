package com.qa.e8Iteration;

public class E8Iteration
{

	public int combiner(int num1, int num2, boolean modifier)
	{

		int result;
		
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
			result= num1 * num2;
			else
			result= num1 + num2;
		}
			
		return result;
	}
	
	for (int i=0;i<10;i++);
	{
		
	}

}

/*Create a for loop that will call and output the result of your method from Conditionals
2 10 times, using the current iteration as one of the parameters you pass to it.*/
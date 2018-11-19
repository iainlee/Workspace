package com.qa.Examples;

import java.util.Scanner;

public class SingleThrow {

	public static void main(String[] args) throws MyException
	{
		
		SingleThrow singlethrow = new SingleThrow();
		singlethrow.intro();

	}

	void intro() throws MyException
	{
		try
		{
		method1();
		}
		catch (MyException e)
		{
		
		}
	}
	
	int method1() throws MyException
	{
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		if (userInput == 0)
		{
			throw new MyException();
		}
		else
		{
			return 5/userInput;
		}
	}
	
}

class MyException extends Exception
	{

		public String toString()
		{
			return "Don't divide by zero";
		}
	}
	

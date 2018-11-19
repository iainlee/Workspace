package com.qa.Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwing {

	public static void main(String[] args) {
		
		Throwing throwing = new Throwing();
		throwing.intro();

	}

	int intro()
	{
		try
		{
			return method2();
		}
		catch (InputMismatchException e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	int method2()throws InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	
}
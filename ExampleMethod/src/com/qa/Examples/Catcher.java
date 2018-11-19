package com.qa.Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catcher
{

	public static void main(String[] args)
	{
		
		Catcher catcher = new Catcher();
		catcher.intro();
		System.out.println("hello");
	}
	
	int intro() {
		
		int input=0;
		int myvar;

		Scanner sc = new Scanner(System.in);
		try
		{
			input=sc.nextInt();
			myvar=(Integer)null;
			System.out.println(myvar);
		}

		catch (InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			myvar=0;
		}
		return input;
	}
	
}
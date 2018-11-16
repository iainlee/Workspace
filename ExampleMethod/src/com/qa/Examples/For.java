package com.qa.Examples;

public class For {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++)
		{
		if (i==5) {
			continue;
			//break;
			//return;
		}
		System.out.println(i);
		}
	}
}
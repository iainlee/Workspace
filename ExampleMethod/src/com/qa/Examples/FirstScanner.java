package com.qa.Examples;

import java.util.Scanner;

public class FirstScanner {

	public static void main(String[] args) {
	
		FirstScanner today = new FirstScanner();
		System.out.println(today.input());
		
	}

	public String input()
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	
}
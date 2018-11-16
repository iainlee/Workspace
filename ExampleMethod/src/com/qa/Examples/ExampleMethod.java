package com.qa.Examples;

public class ExampleMethod {

	ExampleMethod example=new ExampleMethod(); // what does this mean
	
	public static void main(String[] args) {
		
		int a= 10;
		int b=20;
		int tt=71;
		
		int c=ExampleMethod.addition(a,b);
		int d=timesten(tt);
		
		System.out.println(c);
		System.out.println(d);
		
		boolean x =method3().equals("!");
		System.out.println(x);
		}
	
		public static int addition(int num1,int num2) {
			return num1+num2;
		}
		
		public static int timesten (int num1) {
			return num1*10;
		}
		
		public static String method3() {
			return "!";
		}
}
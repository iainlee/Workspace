package com.qa.Examples;

public class Scope {

	static int x = 10;
	static int y = 4;

	public static void main(String[] args) {

		y = 6;
		for (int i = 0; i < 1; i++) {
			System.out.println();

			System.out.println(y);
			System.out.println(i);
			System.out.println(x);
			other();
		}
	}

	public static void other() {
		System.out.println(y);
		// System.out.println(i);
		System.out.println(x);
	}
}
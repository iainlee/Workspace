package com.qa.Examples;

public class MyApp {
	
	public String cat = "Pippa";

	public static void main(String[] args) {

		MyApp pippa_app = new MyApp();
		MyApp jack_app = new MyApp();
		jack_app.cat="Jack";
		
		System.out.println(pippa_app.cat);
		System.out.println(jack_app.cat);

	}

}
package com.qa.Examples;

class Planet {

	public static void main(String[] args) {
		
		//assign the asked-for properties to the new cat
		Cat pippa = new Cat("Small", "Meow", true);
		
		Human p1 = new Human ("Gareth");
		Human p2 = new Human ("Shafeeq", "THE");
		//p1.firstName;
		
		System.out.println(pippa.ToString());
		
		System.out.println(pippa.getSpeak());
		System.out.println(pippa.getSize());
		
	}

}
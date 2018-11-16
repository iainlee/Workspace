package com.qa.Examples;

public class Factory {

	public static void main(String[] args) {
		
		Crate crate1 = new Crate("Black","50x60",20);
		Crate crate2 = new Crate("Blue","25x35",11);
		System.out.println(crate1.colour);
		System.out.println(crate2.colour);

	}

}

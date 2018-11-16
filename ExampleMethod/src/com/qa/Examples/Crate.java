package com.qa.Examples;

public class Crate {

	public String colour;
	public int length;
	public int width;
	public int weight;
	public int area;
		
		Crate (String colour, int length, int width, int weight){
			this.colour=colour;
			this.length=length;
			this.width=width;
			this.weight=weight;
			this.area=length*width;
		}

}
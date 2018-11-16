package com.qa.e16Garage;

class Car extends Vehicle{
	
	private int seats;
	
	Car(int seats, String maker, String license) {
		super(maker,license);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
package com.qa.e16Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E16Garage {

	private static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public static void main(String[] args)
	{
		Vehicle C1 = new Car(4,"Honda","ZXFG37N3");
		Vehicle C2 = new Car(2,"Hyundai","K6HIB07K");
		Vehicle M1 = new Motorcycle(240,"Mitsubishi","XFTY4KG8");
		Vehicle M2 = new Motorcycle(300,"GM", "03ZYM2DY");
		Vehicle V1 = new Van("1000x5000","Ford", "AW03NK48");
		Vehicle V2 = new Van("1200x4500","Volvo","Q639HPXY");	
		
		vehicleList.add(C1);
		vehicleList.add(C2);
		vehicleList.add(M1);
		vehicleList.add(M2);
		vehicleList.add(V1);
		vehicleList.add(V2);

		totalRevenue(vehicleList);
		
	}

	static int totalRevenue(ArrayList<Vehicle> vehicleList)
	{
		int revenue = 0;

		//Foreach/stream, identifying vehicle type and printing out the bill for that type
		
		List<Vehicle> streamedVehicles = vehicleList.stream().collect(Collectors.toList());
		
		vehicleList.toString();
		System.out.println(vehicleList);
		//System.out.println(streamedVehicles);
				
		return revenue;
	}
	
	void addVehicle (String programName, String Type, String maker, String license)
	{
		//Vehicle programName = new Type("maker","license")
	}
	
	void removeVehicleById (String license)
	{
		
	}
	
	void removeVehicleByType ()
	{
		
	}
	
	int fixVehicle ()
	{
		int bill = 0;
		return bill;
	}
	
	void emptyGarage ()
	{
		vehicleList.clear();
	}
	
}

/*Using Vehicle as a base class, create three derived classes (car, motorcycle etc.),
each derived class should have its own individual attribute in addition to the normal
Vehicle attributes that it inherits.

Using a List implementation store all your vehicles in a Garage class (e.g. ArrayList)

Create a method in Garage that iterates through each Vehicle, calculating a bill for
each type of Vehicle in a different way, depending on the type of vehicle it is.

Garage should have methods that add Vehicle, remove Vehicle(s) (By ID, By Vehicle
Type) fix Vehicle (Calculate bill) and empty the garage.*/
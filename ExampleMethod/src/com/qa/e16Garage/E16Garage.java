package com.qa.e16Garage;

import java.util.ArrayList;
import java.util.Scanner;

public class E16Garage
{

	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	Scanner sc = new Scanner(System.in);
	
	Vehicle C1 = new Car(4,"Honda","ZXFG37N3");
	Vehicle C2 = new Car(2,"Hyundai","K6HIB07K");
	Vehicle M1 = new Motorcycle(240,"Mitsubishi","XFTY4KG8");
	Vehicle M2 = new Motorcycle(300,"GM", "03ZYM2DY");
	Vehicle V1 = new Van("1000x5000","Ford", "AW03NK48");
	Vehicle V2 = new Van("1200x4500","Volvo","Q639HPXY");	
		
	void intro ()
	{
		vehicleList.add(C1);
		vehicleList.add(C2);
		vehicleList.add(M1);
		vehicleList.add(M2);
		vehicleList.add(V1);
		vehicleList.add(V2);

		totalRevenue(vehicleList);
		String input = sc.nextLine();
		addCar(0, input, input);
	}

	void totalRevenue(ArrayList<Vehicle> vehicleList)
	{
		int revenue = 0;
		
		for (Vehicle vehicle:vehicleList)
		{
			System.out.println(vehicle.license);
			System.out.println(vehicle.maker);

			if (vehicle instanceof Car)
			{
				System.out.println("Car: £50");
				revenue = revenue+50;
			}
			else if (vehicle instanceof Motorcycle)
			{
				System.out.println("Motorcycle: £20");
				revenue = revenue+20;
			}
			else if (vehicle instanceof Van)
			{
				System.out.println("Van: £80");
				revenue = revenue+80;
			}
			else 
			{
				System.out.println("ERROR, unknown vehicle");
			}
		}
		System.out.println("Total revenue: £" + revenue);				
	}
	
	void addCar (int seats, String maker, String license)
	{
			Vehicle car = new Car (seats, maker, license);
			vehicleList.add(car);	
	}
	
	void addMotorcycle (int ccs, String maker, String license)
	{
			Vehicle motorcycle = new Motorcycle (ccs, maker, license);
			vehicleList.add(motorcycle);	
	}
	
	void addVan (String bootsize, String maker, String license)
	{
			Vehicle van = new Van (bootsize, maker, license);
			vehicleList.add(van);	
	}
	
	void removeVehicleById (String input)
	{
		//get array index for specified license
		
		//System.out.println(vehicleList.lastIndexOf(input));
		//vehicleList.remove(vehicleList.lastIndexOf(license));
		
		//delete thing at that index
	}
	
	void removeVehicleByType (String input)
	{
		//vehicleList.remove(input);
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
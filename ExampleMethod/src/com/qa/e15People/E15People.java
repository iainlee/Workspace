package com.qa.e15People;

import java.util.List;
import java.util.stream.Collectors;

class E15People {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Andrew",39,"Bank Manager");
		Person person2 = new Person("Barbara",18,"Admin Assistant");
		Person person3 = new Person("John",42,"Security Guard");
		
		//System.out.println(Person.personList.get(0).name);
		
		for (Person person : Person.personList) {
			System.out.println(person.toString());
		}
		
		//E15People pickle=new E15People();
		//pickle.search("Barbara");
	}
	//pPerson search (String searchname){
		
		//List<Person> streamedPeople = Person.personList.stream().filter(person -> person.equals(searchname)).collect(Collectors.toList());
		//personList.IndexOf();
		//System.out.println(streamedPeople);
	
		//return;
	//}

		@Override
		public String toString() {
			return "E15People [Name= " + Person.name + ", Age = " + Person.age + ", Job Title = " + Person.job + "]";
		}
}
//Create a Person class that models the following:
//• Name
//• Age
//• Job Title
//And has a method to return all three of these in a formatted string. (Override the
//toString() method!)
//Create some example objects with this class.
//Create an ArrayList and store those objects inside.
//Use an enhanced for loop to output all of your people to the console.
//Create a method that searches for the Person object by their name.
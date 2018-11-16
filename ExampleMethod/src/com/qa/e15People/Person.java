package com.qa.e15People;

import java.util.ArrayList;

class Person {

	String name;
	int age;
	String job;
	static ArrayList<Person> personList = new ArrayList<Person>();
		
		Person (String name, int age, String job){
			this.name=name;
			this.age=age;
			this.job=job;
			
			personList.add(this);
		}

		private static ArrayList<Person> getPersonList() {
			return personList;
		}

		private static void setPersonList(ArrayList<Person> personList) {
			Person.personList = personList;
		}

}
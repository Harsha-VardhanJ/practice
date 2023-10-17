package com.kn.inheritance2;

public class Main {

	public static void main(String[] args) {
		
		Manager m = new Manager("John", 75000);
		System.out.println("Manager Details: ");
		m.displayDetails("John", 75000);
		System.out.println();
		Developer d = new Developer("Smith", 60000);
		System.out.println("Developer Details: ");
		d.displayDetails("Smith", 60000);
	}

}

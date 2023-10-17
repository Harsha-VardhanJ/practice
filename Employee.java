package com.kn.inheritance2;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void displayDetails(String name, double salary) {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}

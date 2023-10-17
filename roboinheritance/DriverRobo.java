package com.kn.roboinheritance;

public class DriverRobo extends Robo {
	
	public DriverRobo(String name, String type) {
		super(name,type);
	}
	
	public void drive() {
		System.out.println("Drives any vehicle");
	}
	
}

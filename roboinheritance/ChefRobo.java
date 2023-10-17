package com.kn.roboinheritance;

public class ChefRobo extends Robo{
	
	public ChefRobo(String name, String type) {
		super(name,type);
	}
	
	public void cook() {
		System.out.println("Cooks any dish");
	}
	
}

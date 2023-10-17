package com.kn.inheritanceandconstructors;

public class Main extends Derived{
	
	public Main() {
		System.out.println("Main class constructor called");
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}
	
}

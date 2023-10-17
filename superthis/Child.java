package com.kn.superthis;

public class Child extends Parent {
	
	public Child() {
		System.out.println("Child no arg constructor");
	}
	
	public Child(String name, int age) {
		System.out.println("Child 2-arg constructor");
	}
}

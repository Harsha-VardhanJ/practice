package com.kn.inheritance;

public class Admin extends Developer {
	
	public void manage() {
		super.read();
		write();
		System.out.println("Managing the entire application");
	}
	
	public void read() {
		System.out.println("View access updated");
	}
}

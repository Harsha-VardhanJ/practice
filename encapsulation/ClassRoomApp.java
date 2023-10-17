package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassRoom c1 = new ClassRoom();
	//	System.out.println("Temperature = "+c1.temperature);
	//	c1.temperature = 50;
	//	System.out.println("Modified Temperature = "+c1.temperature);
		
		System.out.println("Temperature = "+c1.getTemperature());
		System.out.println("Enter temperature of Classroom");
		int t = scan.nextInt();
		c1.setTemperature(t);
		System.out.println("Modified Temperature = "+c1.getTemperature());
		
		scan.close();
	}

}

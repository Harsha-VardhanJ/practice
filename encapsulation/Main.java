package com.kn.encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam e1 = new Exam();
		int id = scan.nextInt();
		String name = scan.next();
		double salary = scan.nextDouble();
		
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		
		if(id>=1 && id<=50) {
			e1.setTeamName("Team A");
		}
		if(id>=51 && id<=100) {
			e1.setTeamName("Team B");
		}
		
		System.out.println("Employee Information:");
		System.out.println("ID: "+e1.getId());
		System.out.println("Name: "+e1.getName());
		System.out.println("Salary: "+e1.getSalary());
		System.out.println("Team Name: "+e1.getTeamName());
		
		scan.close();
	}

}

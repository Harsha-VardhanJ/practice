package com.kn.arrayofobjects;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of student objects to be created:");
		Student[] srr = new Student[scan.nextInt()];
		
		for(int i=0; i<srr.length; i++) {
			System.out.println("Enter id of Student"+(i+1)+" :");
			int id = scan.nextInt();
			System.out.println("Enter name of Student"+(i+1)+" :");
			String name = scan.next();
			System.out.println("Enter marks of Student"+(i+1)+" :");
			int marks = scan.nextInt();
			
			Student s = new Student(id, name, marks);
			srr[i] = s;
		}
		
		for(Student s:srr) {
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
		System.out.println("After normalisation:");
		for(Student s:srr) {
			if(s.marks < 35) {
				int add = 35-(s.marks);
				s.marks = s.marks+add;
			}
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
		scan.close();
	}

}

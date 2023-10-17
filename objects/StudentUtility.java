package com.kn.objects;

import java.util.Scanner;

public class StudentUtility {
	
	public static Student[] studentObjectCreation(int n) {
		Scanner scan = new Scanner(System.in);
		Student[] srr = new Student[n];
		
		for(int i=0; i<srr.length; i++) {
			System.out.println("Data of Student "+(i+1));
			System.out.println("Enter id:");
			int id = scan.nextInt();
			System.out.println("Enter name:");
			String name = scan.next();
			System.out.println("Enter marks:");
			int marks = scan.nextInt();
			
			srr[i] = new Student(id,name,marks);
		}
		scan.close();
		return srr;
		
	}
	
	public static Student[] sortByIdAsc(Student[] arr) {
		Student temp = null;
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j].id > arr[j+1].id) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count = 1;
				}
			}
			if(count==0) {
				break;
			}
		}
		return arr;
	}

	public static Student[] sortByIdDesc(Student[] arr) {
		Student temp = null;
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j].id < arr[j+1].id) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count = 1;
				}
			}
			if(count == 0) {
				break;
			}
		}
		
		return arr;
	}

	public static Student[] sortByNameAsc(Student[] arr) {
		Student temp = null;
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(((arr[j].name).compareTo(arr[j+1].name)) > 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(count==0) {
				break;
			}
		}
		return arr;
	}

	public static Student[] sortByNameDesc(Student[] arr) {
		Student temp = null;
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(((arr[j].name).compareTo(arr[j+1].name)) < 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(count==0) {
				break;
			}
		}
		return arr;
	}
}

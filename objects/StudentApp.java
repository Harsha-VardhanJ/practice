package com.kn.objects;

public class StudentApp {

	public static void main(String[] args) {
		Student[] arr = StudentUtility.studentObjectCreation(3);
		
		for(Student s:arr) {
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
		
		System.out.println("-------->After sorting by id in ASC<---------");
		
		Student[] srrByIdAsc = StudentUtility.sortByIdAsc(arr);
		for(Student s:srrByIdAsc) {
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
		
		System.out.println("-------->After sorting by id in DESC<---------");
		
		Student[] srrByIdDesc = StudentUtility.sortByIdDesc(arr);
		for(Student s:srrByIdDesc) {
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
		
		System.out.println("--------->After sorting by name in ASC<----------");
		
		Student[] srrByNameAsc = StudentUtility.sortByNameAsc(arr);
		for(Student s:srrByNameAsc) {
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
		
		System.out.println("--------->After sorting by name in DESC<----------");
		
		Student[] srrByNameDesc = StudentUtility.sortByNameDesc(arr);
		for(Student s:srrByNameDesc) {
			System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}
	}

}

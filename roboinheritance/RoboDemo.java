package com.kn.roboinheritance;

public class RoboDemo {

	public static void main(String[] args) {
		
		ChefRobo cr = new ChefRobo("Abhi", "Chef");
		System.out.println("ChefRobo details");
		System.out.println("Name = "+cr.name);
		System.out.println("Type = "+cr.type);
		cr.walk();
		cr.talk();
		cr.charge();
		cr.cook();

		DriverRobo dr = new DriverRobo("Harsha", "Driver");
		System.out.println("DriverRobo details");
		System.out.println("Name = "+dr.name);
		System.out.println("Type = "+dr.type);
		dr.walk();
		dr.talk();
		dr.charge();
		dr.drive();

		TeacherRobo tr = new TeacherRobo("Pavan", "Teacher");
		System.out.println("TeacherRobo details");
		System.out.println("Name = "+tr.name);
		System.out.println("Type = "+tr.type);
		tr.walk();
		tr.talk();
		tr.charge();
		tr.teach();
		
		
	}

}

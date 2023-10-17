package com.kn.roboinheritance;

public class TeacherRobo extends Robo{
	
	public TeacherRobo(String name, String type) {
		super(name,type);
	}
	
	public void teach() {
		System.out.println("Teaches any subject");
	}
	
}

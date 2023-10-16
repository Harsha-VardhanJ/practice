package com.kn.reversingstringpreservingspaces;

import java.util.Scanner;

public class ReversingStringMaintainingSpacesDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scan.nextLine();
		
		ReverseStringMaintainingSpaces rsms = new ReverseStringMaintainingSpaces();
		String resultantStr = rsms.reverseStringMaintainingSpaces(inputStr);
		
		System.out.println(resultantStr);
		
		scan.close();
	}

}

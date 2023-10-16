package com.kn.reverseString;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter the string to be reversed: ");
		String inputStr = scan.nextLine();
		
		//Create object of ReverseString class
		ReverseString reverseStr = new ReverseString();
		
		//Calling reverse string method
		String outputStr = reverseStr.reverseString(inputStr);
		System.out.println("The reversed string is "+ outputStr);
		scan.close();
		
	}

}

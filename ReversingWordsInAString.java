package com.kn.reverseString;

import java.util.Scanner;

public class ReversingWordsInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Take input from user
		System.out.println("Enter a sentence:");
		String input = scan.nextLine();
		
		//Split the string into words
		String[] srr = input.split(" ");
		
		StringReversal s = new StringReversal();
		for(int i=0; i<srr.length; i++) {
			s.printCharactersInReverse(srr[i]);
		}
		
		scan.close();
	}

}

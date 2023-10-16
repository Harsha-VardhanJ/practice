package com.kn.anagramstrings;

import java.util.Scanner;

public class AnagramStringsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1 = scan.nextLine();
		System.out.println("Enter string2:");
		String str2 = scan.nextLine();
		
		AnagramStrings aS = new AnagramStrings();
		boolean result = aS.anagramStrings(str1, str2);
		
		if(result) {
			System.out.println("Two strings are ANAGRAMS");
		}
		else {
			System.out.println("Two strings are NOT ANAGRAMS");
		}
		
		scan.close();
	}

}

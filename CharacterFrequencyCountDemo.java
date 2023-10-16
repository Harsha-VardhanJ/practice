package com.kn.characterfrequencycount;

import java.util.Scanner;

public class CharacterFrequencyCountDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scan.nextLine();
		
		CharacterFrequencyCount cfc = new CharacterFrequencyCount();
		cfc.characterFrequencyCount(inputStr);
		
		scan.close();
	}

}

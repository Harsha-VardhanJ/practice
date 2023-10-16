package com.kn.capitalizefirstcharacter;

import java.util.Scanner;

public class CapitalizeFirstCharacterDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scan.nextLine();
		
		CapitalizeFirstCharacter cfc = new CapitalizeFirstCharacter();
		String resultantString = cfc.capitalizeFirstCharacter(inputStr);
		
		System.out.println(resultantString);
		
		scan.close();
	}

}

package com.kn.reverseString;

public class StringReversal {
	public void printCharactersInReverse(String s1) {
		char[] crr = s1.toCharArray();
		for(int i=crr.length-1; i>=0; i--) {
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}
}

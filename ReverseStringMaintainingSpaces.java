package com.kn.reversingstringpreservingspaces;

public class ReverseStringMaintainingSpaces {
	
	public String reverseStringMaintainingSpaces(String inputStr) {
		char[] crr = inputStr.toCharArray();
		char[] rev = new char[crr.length];
		
		for(int i=0; i<crr.length; i++) {
			if(crr[i]==' ') {
				rev[i] = crr[i];
			}
		}
		int j=rev.length-1;
		for(int i=0; i<crr.length; i++) {
			if(crr[i]!=' ') {
				if(rev[j]==' ') {
					j--;
				}
				rev[j] = crr[i];
				j--;
			}
		}
		String s1 = String.valueOf(rev);
		return s1;
	}

}

package com.kn.anagramstrings;

public class AnagramStrings {
	
	public boolean anagramStrings(String str1, String str2) {
		if(str1.length()==str2.length()) {
			char[] crr1 = str1.toCharArray();
			char[] crr2 = str2.toCharArray();
			
			crr1 = sortCharacterArray(crr1);
			crr2 = sortCharacterArray(crr2);
			
			for(int i=0; i<crr1.length; i++) {
				if(crr1[i]!=crr2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public char[] sortCharacterArray(char[] crr) {
		for(int i=0; i<crr.length-1; i++) {
			for(int j=0; j<crr.length-1-i; j++) {
				if(crr[j]>crr[j+1]) {
					char temp = crr[j];
					crr[j] = crr[j+1];
					crr[j+1] = temp;
				}
			}
		}
		return crr;
	}
}

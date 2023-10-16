package com.kn.capitalizefirstcharacter;

public class CapitalizeFirstCharacter {
	
	public String capitalizeFirstCharacter(String inputStr) {
		String[] srr = inputStr.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s : srr) {
			char[] crr = s.toCharArray();
			for(int i=0; i<crr.length; i++) {
				if(crr[0]>=97 && crr[0]<=122) {
					crr[0] = (char)(crr[0]-32);
				}
				sb = sb.append(crr[i]);
			}
			sb = sb.append(" ");
		}
		String s1 = sb.toString();
		return s1.trim();
		
	}

}

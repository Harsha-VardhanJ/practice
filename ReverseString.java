package com.kn.reverseString;

public class ReverseString {
	
	//Method to reverse a string
	public String reverseString(String inputStr) {
		char[] crr = inputStr.toCharArray();
		StringBuffer strbuf = new StringBuffer();
		for(int i=crr.length-1; i>=0; i--) {
			strbuf = strbuf.append(crr[i]);
		}
		return strbuf.toString();
	}

}

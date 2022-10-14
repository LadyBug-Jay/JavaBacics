package com.syntax.class12;

public class StrReplaceMeth {

	public static void main(String[] args) {
		
		//Method: Replace and ReplaceAll
		// Replace method replaces one string with another in a string
		//ReplaceAll replaces all the characters that follow that pattern
		
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		System.out.println(str.replace("good", "Excellent"));
		System.out.println(str.replaceAll("[a-z]", "#"));

	}

}

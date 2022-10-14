package com.syntax.class12;

public class StrValueOfMeth {

	public static void main(String[] args) {
		
		//Method: Value of. This converts integers to String and then you can use the method parseInt to convert it back to an integer.
		
		int num= 121232323;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		
		//Converting to integer
		num= Integer.parseInt(numStr);
		System.out.println(num);

	}

}

package com.syntax.class12;

public class StrEndsWithMeth {

	public static void main(String[] args) {
		
		// The endsWith and "contains" Methods
		
		String str="Java is Very easy";
		
		
		/*
         * endsWith=> checks if a String Ends with a specific letter or word
		 */
       
        
        System.out.println(str.endsWith("y"));
        
        //Method chaining helps us calls multiple methods on a single line one method after another
        System.out.println(str.toLowerCase().contains("very"));
		
	}

}

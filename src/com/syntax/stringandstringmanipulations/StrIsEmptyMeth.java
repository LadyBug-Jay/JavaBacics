package com.syntax.class12;

public class StrIsEmptyMeth {

	public static void main(String[] args) {
		// "Is Empty"Method and "Is Blank"Method
		
		String firstName="Olena";
        String lastName="Dudka";
        System.out.println(firstName+lastName); // Mostly this is used
        System.out.println(firstName.concat(" ").concat(lastName));

        String str=" ";
        /*
         * isEmpty() returns true if a String is empty this method will return false even if you have
         * a space in a String variable however the isBalnk method does not count the spaces
         */
        System.out.println(str.isEmpty());
      


    }


	}



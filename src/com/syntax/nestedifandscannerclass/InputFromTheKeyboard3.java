package com.syntax.nestedifandscannerclass;

import java.util.Scanner;

public class InputFromTheKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your age in the console");		
   int age=scanner.nextInt();

      if (age<18) 
    {
     	System.out.println("You should study");
    }
    else 
    {
    	System.out.println("You should start working");
    }
	
	}

}

package com.syntax.nestedifandscannerclass;

import java.util.Scanner;

public class InputFromTheKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input= new Scanner(System.in);
		//This message will be displayed to the user on the console after you run the program. It tells the user what is expected of him
	System.out.println("Please enter your name on the console");
	
	// This activates the java program to take the input from the keyboards and store it inside the main variable
	String name=input.next();
	
	//This prints whatever name user enters on the keyboard on the console when you click the enter key
	System.out.println("Hello "+name);

	
	
	
	
	}

}

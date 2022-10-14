package com.syntax.logicaloperators.homework;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Enter you birth month");
	
	String month= scanner.nextLine();
	
	if (month.equals("January") || month.equals("Febuary") ||month.equals("December") )
	{
        System.out.println("Winter");
	}   
    else if (month.equals("March") || month.equals("April") ||month.equals("May")) 
    {
        System.out.println("Spring");
    }
    else if (month.equals("June")|| month.equals("July") || month.equals("August")) 
    {
        System.out.println("Summer");
    }
    else if (month.equals("September") || month.equals("October") || month.equals("November")) 
    {
        System.out.println("Autumn");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

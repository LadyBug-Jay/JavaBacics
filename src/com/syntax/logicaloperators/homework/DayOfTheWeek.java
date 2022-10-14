package com.syntax.logicaloperators.homework;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Enter a number");
		
		int day= scanner.nextInt();	
	
		if(day==1 || day==2 || day==3 || day==4 || day==5) 
		{
            System.out.println("It is a weekday");
		}
		else if (day==6 || day==7)
		{
			System.out.println("It is a weekend");
		}
		else 
		{
			System.out.println("invalid day");
	    }
	
	
	
	
	
	
	
	}

}

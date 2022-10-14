package com.syntax.logicaloperators.homework;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		  Scanner scanner=new Scanner(System.in);	
			
			System.out.println("Enter the current time using 24hour format");
			
	
			int hour = scanner.nextInt();
			
			if(hour>0 && hour<=11) 
			{
	            System.out.println( "Morning");
			}	
			else if (hour>11 && hour<=15)
			{
			System.out.println( "Afternoon");
			}
			else if(hour>15 && hour<=20)
			{
				System.out.println( "Evening");
		    }
			else if(hour>20 && hour<=24)
			{
				System.out.println( "Night");
		    }
			else 
			{System.out.println( "Invalid Number");
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

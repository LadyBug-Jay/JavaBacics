package com.syntax.class04.homework;

import java.util.Scanner;

public class BonusEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner=new Scanner(System.in);
		System.out.println("Specify the number of years of service in the console and click the enter key.");		
   int yearsOfService=scanner.nextInt();
   
   if(yearsOfService>=5)
	{
	   System.out.println("You are eligible for bonus.");
	   System.out.println("Specify annual salary.");
	     
	   double annualSalary=scanner.nextDouble();
	   
	   if(annualSalary>=50000)
		{
			System.out.println("Bonus is 5000.");
		}
	   else
		{
			System.out.println("Bonus is 3000.");
		}
	}
   else 
   {
	   System.out.println("You are not eligible for bonus.");
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

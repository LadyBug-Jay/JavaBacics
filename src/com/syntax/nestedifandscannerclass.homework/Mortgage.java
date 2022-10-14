package com.syntax.class04.homework;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Specify mortgage rate in the console and click on enter key.");		
   double mortgageRate=scanner.nextDouble();
   
  
   if(mortgageRate<=4.5)
	{
	   System.out.println("Consider buying a house.");
	   
	   System.out.println("Specify mortgage price in the console and click on enter key.");   
	   double mortgagePrice=scanner.nextDouble();
	   
	   if(mortgagePrice>200000)
		{
			System.out.println("Please take a loan.");
		}
	   else
		{
			System.out.println("Please pay cash.");
		}
	}
   else 
   {
	   System.out.println("Consider not buying a house.");
   }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

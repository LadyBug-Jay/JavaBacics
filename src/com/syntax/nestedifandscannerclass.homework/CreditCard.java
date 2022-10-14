package com.syntax.class04.homework;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you own a credit card? Specify true/false in the console and click enter.");		
   boolean hasCreditCard=scanner.nextBoolean();
   
  
   if(hasCreditCard)
	{
	   System.out.println("Specify credit card balance and click enter.");
	   
	   double cardBalance=scanner.nextDouble();
	   
	   if(cardBalance>1000)
		{
			System.out.println("Kindly Pay off immediately.");
		}
	   else
		{
			System.out.println("You can Spend more.");
		}
	}
   else 
   {
	   System.out.println("Get Our platinum credit card for 10% discount on every purchase.");
   }		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

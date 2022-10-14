package com.syntax.class04.homework;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma? Specify true/false in the console and click the enter key.");		
   boolean diploma=scanner.nextBoolean();
   
  
   if(diploma)
	{
	   System.out.println("Congratulations. Specify your gpa on the console and click the enter key.");
	   
	     
	   double gpa=scanner.nextDouble();
	   
	   if(gpa>=3.5)
		{
			System.out.println("You are eligible for scholarship.");
		}
	   else
		{
			System.out.println("You should have studied harder.");
		}
	}
   else 
   {
	   System.out.println("We suggest you should first get a diploma.");
   }
   
   
   
   
   
   
   
   
   
   
    
 
			
		
		
	}

}

package com.syntax.class04.homework;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Specify your age in the console and click on enter key.");		
   int age=scanner.nextInt();
   
  
   if(age>=18)
	{
	   System.out.println("Issue a Driver's License.");
	}
   else 
   {
	   System.out.println("Get a Learners Permit.");
   }	
		
				
				
		
	}

}

package com.syntax.logicaloperators.homework;

import java.util.Scanner;

public class Heights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Enter Your Height in Inches");
		
		int height= scanner.nextInt();
		
		if(height<60) 
		{
            System.out.println( "short");
		}
		else if (height>=60 && height<=72)
		{
			System.out.println( "medium");
		}
		else 
		{
			System.out.println( "tall");
	    }
		
		
		
		
		
		
		
		
		
	}

}

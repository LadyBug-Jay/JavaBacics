package com.syntax.logicaloperators.homework;

import java.util.Scanner;

public class SizeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Enter a number between 1 and 1000");
		
		
int num= scanner.nextInt();
		
		if(num>0 && num<=10) 
		{
            System.out.println( "small");
		}
		else if (num>10 && num<=100)
		{
		System.out.println( "medium");
		}
		else if(num>100 && num<=1000)
		{
			System.out.println( "large");
	    }
		
		else 
		{
			System.out.println( "Invalid input");
		}
		
		
		
		
	}

}

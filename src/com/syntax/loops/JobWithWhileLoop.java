package com.syntax.loops;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Write a program to ask user if they got a job
	
	Scanner input =new Scanner (System.in);
	String answer;
	
	System.out.println("Did you get a job");
	answer=input.nextLine();
	
	while(!answer.equals("yes")) {
		
		System.out.println("Did you get a job");
		 answer= input.nextLine();
	}
	
	System.out.println("Congrats");
	
	
	
	
	
	
	}

}

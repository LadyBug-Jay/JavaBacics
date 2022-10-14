package com.syntax.class07.Homework;

import java.util.Scanner;

public class ForLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Write a program to prompt user to ask for name 3 times and print good afternoon name
				Scanner input = new Scanner(System.in);
				
				String name = null;

				for(int num=3; num>=1;num--) {
					System.out.println("what is your name");
					name=input.nextLine();
				}
				
		
				System.out.println("Good afternoon "+name);
	}

}

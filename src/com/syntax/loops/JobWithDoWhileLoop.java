package com.syntax.loops;

import java.util.Scanner;

public class JobWithDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Write a program to ask user if they got a job
		Scanner input = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Did you get a job");
			answer = input.nextLine();
		} while (!answer.equals("yes")); // this means "not equal" to yes. Now remember that condition is executed only
										// when the value of condition is true.So its only when users answer is true that i can loop.
			System.out.println("Congrats");								// if user answers "NO" no, is a false however the "!"operator makes it a true value hence loop will be executed
											// If user answers "MAyBE", maybe is false however the "!"operator make it a true value hence loop will be executed
											// if user answers a "YES", Yes is True however the "!"operator makes it a false value. Hence the loop execution will stop

	}

}

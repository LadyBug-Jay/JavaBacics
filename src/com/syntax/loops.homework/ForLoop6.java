package com.syntax.class07.Homework;

import java.util.Scanner;

public class ForLoop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a variable to store a price for a coffee. Ask the user to pay for a
		// coffee. Keep asking to pay for coffee until the user enters the EXACT amount
		// . If the user gives more than coffee price --> ask them to give less, if the
		// user gives less money then ask to give more. Once user give EXACT amount
		// print “Please enjoy your coffee
		
		Scanner input = new Scanner(System.in);

		System.out.println("Pay for coffee");

		double price = 10;
		double payment;

		do {

			payment = input.nextDouble();
			if (price > payment) {
				System.out.println("Please give more");
			} else if (price < payment) {
				System.out.println("Please give less");
			}

		} while (price != payment);
		System.out.println("Please enjoy your coffee");

	}

}

package com.syntax.switchcase.homework;

import java.util.Scanner;

public class EnhanceCodeForBirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter you birth month");

		String month = scanner.nextLine();
		String season;

		if (month.equals("January") || month.equals("Febuary") || month.equals("December")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Autumn";
		} else {
			System.out.println("Wrong month entered");
			season = "invalid";
		}

		System.out.println("You were born in " + season);

	}

}

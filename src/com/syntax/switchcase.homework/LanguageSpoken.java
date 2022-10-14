package com.syntax.switchcase.homework;

import java.util.Scanner;

public class LanguageSpoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your country");

		String country = input.nextLine();
		String language;

		switch (country) {

		case "Nigeria":
			language = "English";
			break;
		case "China":
			language = "Chinese";
			break;
		case "France":
			language = "French";
			break;
		case "Germany":
			language = "German";
			break;
		case "Portugal":
			language = "Portuguese";
			break;
		default:
			language = "Unknown";
			break;

		}
		System.out.println("Your langauage is " +language);

	}

}

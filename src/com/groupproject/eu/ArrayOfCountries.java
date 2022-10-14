package com.groupproject.eu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Scanner create an array of countries
		// When an array is created, retrieve all values from it
		// and while retrieving those values print capital for each country.(use 2
		// different loops).

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of elements ");
		int size = input.nextInt(); // Initialize array size
		// Two arrays to store the countries and another to store the capital
		String[] country = new String[size]; // Declare the array
		String[] capital = new String[size];

		input.nextLine();// This is just to consume that extra enter that we will be getting from line 18s

		for (int i = 0; i < size; i++) // Initialize the array
		{
			System.out.println("Enter the country name");
			country[i] = input.nextLine();

			System.out.println("Enter the capital for " +country[i]);
			capital[i] = input.nextLine();
		}

		System.out.println(Arrays.toString(country));
		System.out.println(Arrays.toString(capital));

		System.out.println("---------------------------------------------------------");

		// Another way

		 for(int i=0;i<size;i++) {
			 System.out.println("The Country "+ country[i]+" Has the capital "+capital[i]);
		 }

	}

}

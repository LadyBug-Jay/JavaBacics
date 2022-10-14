package com.groupproject.eu;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Scanner create an array of integer values. After the array is created,
		// calculate the sum of all stored elements in that array.

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of elements ");//capture the size
		int size = input.nextInt(); // Initialize array size
		int [] arr = new int[size]; // Declare the array
		
		
		
		for (int i = 0; i < size; i++) // Initialize the array
		{
			System.out.println("Enter the elements of the array ");
		arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		int sum = 0; // Variable to calculate the total sum
		// Using For each loop
		for (int nums : arr) {
			sum = sum + nums; // Increment the value of sum in each iteration
		}

		// Print the total sum
		System.out.println("The sum of all the elements in the array is " + sum);

	}

}

package com.syntax.class10;

public class TwoDArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program that prints the highest value in the array.

		int arr[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 },

		};

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}

		}
		System.out.println("Maximum Value : " + max);

	}

}

package com.syntax.2Darrays;

public class TwoDArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array(shorter way) in which first array will consist of 4 names
		// and second array will contain grades. Then your program should print name of
		// the students that has A and B grade

		String[][] arr = {

				{ "Judith", "Henry", "Ben", "John" }, 
				{ "A", "B", "C", "D" } 
				
		};

		System.out.println(arr[0][0] + "=" + arr[1][0]);
		System.out.println(arr[0][1] + "=" + arr[1][1]);
		System.out.println(arr[0][2] + "=" + arr[1][2]);
		System.out.println(arr[0][3] + "=" + arr[1][3]);

	}

}

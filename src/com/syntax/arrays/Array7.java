package com.syntax.arrays;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4. From an array of integer elements find the largest number.

		int[] num = new int[5];

		num[0] = 12;
		num[1] = 10;
		num[2] = 6;
		num[3] = 2;
		num[4] = 88;

		int largest = 0;

		for (int value : num) {

			if (value > largest) {
				largest = value;
			}
		}
		System.out.println("The largest number is "+largest);
		
		System.out.println("---------------------------------------------");
		
		
		int[] numbers = {10,20,30,40,50} ;
		
        int  largestNumber=num[0];

		for(int i=1; i<num.length; i++) {
			
		}
		
		
		
		
		
		
	}
}

package com.syntax.class09;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array on integers and calculate the sum of all elements in an array

		int[] num = new int[5];

		num[0] = 12;
		num[1] = 10;
		num[2] = 6;
		num[3] = 2;
		num[4] = 1;

		int sum = 0; 
		
		for(int i=0; i<num.length; i++) { //regular for loop
			sum+=num[i];
		}
		
		System.out.println("The sum of this array is "+sum);
		
		System.out.println("---------------------------------------------");
	
		int[] numbers = {10,20,30,40,50} ;

        int sum2 = 0;
        for (int number:numbers) {   //Enhanced loop
            sum+=number;

        }
        System.out.println("The sum of this array is "+sum);
		
		
		
		
		
		
		
	}

}

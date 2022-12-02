package com.syntax.arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		

		String[] car = new String[6];

		car[0] = "Audi";
		car[1] = "Ferrari";
		car[2] = "Cadillac";
		car[3] = "BMW";
		car[4] = "Ford";
		car[5]= "Chevrolet";

		for(int i=0; i<car.length;i++ ) {
			System.out.println(car[i]);
		}

		System.out.println("------------Another way using enhanced loop---------------------------");
		

		for(String brand:car) {
			System.out.println(brand);
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}

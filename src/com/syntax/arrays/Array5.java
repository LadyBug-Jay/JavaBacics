package com.syntax.arrays;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.	
		
		String[] animal = new String[5];

		animal[0] = "Antelope";
		animal[1] = "Cat";
		animal[2] = "Dog";
		animal[3] = "Elephat";
		animal[4] = "Lion";
		

		for(int i=0; i<animal.length;i++ ) {
			System.out.println(animal[i]);
		}

		System.out.println("---------------------------------------");
		

		for(String name:animal) {
			System.out.println(name);
		}
		
		
		
		
		
	}

}

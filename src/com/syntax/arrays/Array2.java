package com.syntax.arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of names and store all names of your group. Then print your
		// name from that array. (use 2 different ways of creating an array).

		String[] name = { "Joy", "James", "Judith", "Jose" };

		System.out.println(name[2]);

		System.out.println("---------------------------------------");

		String[] name2 = new String[4];

		name2[0] = "Joy";
		name2[1] = "James";
		name2[2] = "Judith";
		name2[3] = "Jose";

		System.out.println(name2[2]);

		int size = name2.length;
		System.out.println("Size of array = " + size);

	}

}

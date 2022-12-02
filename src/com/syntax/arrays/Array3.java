package com.syntax.arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word = { "Java", "Saturday", "day", "coding", "is" };

		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

		System.out.println("---------------------------------------");

		String[] word2 = new String[5];

		word2[0] = "Java";
		word2[1] = "Saturday";
		word2[2] = "day";
		word2[3] = "coding";
		word2[4] = "is";

		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

		int size = word2.length;
		System.out.println("Size of array = " + size);

	}

}

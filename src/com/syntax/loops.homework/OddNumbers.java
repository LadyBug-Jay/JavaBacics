package com.syntax.class07.Homework;

public class OddNumbers {

	public static void main(String[] args) {

		// TODO Print odd numbers 20 and 50 in 12ways

		for (int i = 20; i <= 50; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		for (int a = 21; a <= 50; a += 2) {

			System.out.print(a + " ");

		}
	}

}

package com.syntax.class07.Homework;

public class ForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print odd numbers btw 20 and 50 in 2 ways

		for (int num = 21; num < 50; num += 2) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();

		for (int num2 = 21; num2 < 50; num2 += 2) {

			if (num2 % 2 == 1) {
				System.out.print(num2 + " ");
			}

		}

	}

}

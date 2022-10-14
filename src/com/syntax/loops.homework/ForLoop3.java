package com.syntax.class07.Homework;

public class ForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print even numbers from 20 to 1 in 2 ways

		for (int num = 20; num >= 1; num -= 2) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();

		for (int num2 = 20; num2 >= 1; num2 -= 2) {

			if (num2 % 2 == 0) {
				System.out.print(num2 + " ");
			}

		}

	}

}

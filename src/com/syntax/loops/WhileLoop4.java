package com.syntax.loops;

public class WhileLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print all even numbers from 1 to 20

		int num = 1;

		while (num <= 20) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
				
			}
			num++;
		}

		System.out.println("Another way");

		int num2 = 2;

		while (num2 <= 20) {

			System.out.print(num2 + " ");
			num2 += 2;
		}
	}

}

package com.groupproject.eu;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No 7. Write a java program to check whether a given number is prime or not?

		int num = 13;
		int divisorCount = 0; // Prime number is divisible by itself and 1 so divisor count will be a count of
								// 2 for it to be a prime number
								// So the logic will be based on the number of possible divisor

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisorCount++;
			}
		}

		if (divisorCount == 2) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
		System.out.println("---------------------Another way-----------------------------------------");

		int num1 = 9;
		boolean isPrime = true;
		if (num1 > 1) {

			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(num1 + " is Prime");
		} else {

			System.out.println(num1 + " is not Prime");

		}
	}

}

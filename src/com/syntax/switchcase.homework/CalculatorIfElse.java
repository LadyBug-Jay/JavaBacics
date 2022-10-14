package com.syntax.switchcase.homework;

import java.util.Scanner;

public class CalculatorIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number");
		double num1 = input.nextInt();

		System.out.println("Enter second number");
		double  num2 = input.nextInt();

		System.out.println("Enter Arithmetic Operator");
		char arithmeticOperator = input.next().charAt(0);

		

		if (arithmeticOperator == '+') {
			System.out.println(num1 + num2);
		} else if (arithmeticOperator == '-') {
			System.out.println(num1 - num2);
		} else if (arithmeticOperator == '*') {
			System.out.println(num1 * num2);
		} else if (arithmeticOperator == '/') {
			
		System.out.println(num1 / num2);
		}else {
			System.out.println("Wrong Aritmetic Operator entered");
		}
		

	}

}

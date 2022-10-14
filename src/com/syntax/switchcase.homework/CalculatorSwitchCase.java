package com.syntax.switchcase.homework;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number");
		double num1 = input.nextInt();

		System.out.println("Enter second number");
		double num2 = input.nextInt();

		System.out.println("Enter Arithmetic Operator");
		char arithmeticOperator = input.next().charAt(0);
        double result = 0;
		switch (arithmeticOperator) {

		case '+':
			result= num1 + num2;
			break;
		case '-':
			result= num1 - num2;
			break;
		case '*':
			result= num1 * num2;
			break;
		case '/':
			result= num1 / num2;
			break;
		default:
			System.out.println("Wrong Aritmetic Operator entered");
			break;
		}
          System.out.println(result);
	}

}

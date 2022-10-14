package com.syntax.switchcase.homework;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter you quiz score");
		System.out.println("Enter you midTerm score");
		System.out.println("Enter you Final score");

		int quiz = scanner.nextInt();
		int midTerm = scanner.nextInt();
		int finalScore = scanner.nextInt();
		int averageScore = (quiz + midTerm + finalScore) / 3;

		String grade;

		if (averageScore >= 90 && averageScore <= 100) {
			grade = "A";
		} else if (averageScore >= 70 && averageScore < 90) {
			grade = "B";
		} else if (averageScore >= 50 && averageScore < 70) {
			grade = "C";
		} else if (averageScore >= 0 && averageScore < 50) {
			grade = "F";
		} else {
			grade = "Invalid: Incorrect score entered";
		}
		System.out.println(grade);

	}

}

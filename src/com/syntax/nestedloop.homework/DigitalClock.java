package com.syntax.class08.Homework;

public class DigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int hour = 0; hour <= 23; hour++) {
			for (int min = 0; min <= 59; min++) {
				for (int sec = 0; sec <= 59; sec++) {

					System.out.println(hour + ":" + min + ":" + sec);
				}

			}
			System.out.println("\n");

		}

	}

}

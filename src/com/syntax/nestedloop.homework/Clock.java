package com.syntax.class08.Homework;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int hour1 = 0; hour1 <= 2; hour1++) {
			for (int hour2 = 0; hour2 <= 9; hour2++) {

				if (hour1 == 2 && hour2 == 4) {
					break;
				}

				for (int min1 = 0; min1 <= 5; min1++) {
					for (int min2 = 0; min2 <= 9; min2++) {

						System.out.println(hour1 + "" + hour2 + ":" + min1 + "" + min2);
					}

				}

			}

		}

	}

}

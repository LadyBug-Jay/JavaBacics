package com.syntax.class08.Homework;

public class Clock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Another way to do the clock
		for (int h = 0; h < 24; h++) { // Controls hours

			for (int m1 = 0; m1 <= 5; m1++) { // Controls first digit of the minute

				for (int m2 = 0; m2 <= 9; m2++) {// Controls second digit of the minute

					if (h < 10) {
						System.out.println("0" + h + ":" + m1 + m2);
					} else {
						System.out.println(h + ":" + m1 + m2);
					}
				}
			}
		}
	}
}

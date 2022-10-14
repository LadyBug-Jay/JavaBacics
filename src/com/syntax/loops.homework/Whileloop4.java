package com.syntax.class07.Homework;

public class Whileloop4 {

	public static void main(String[] args) {

//Print all even numbers 1 to 20
		int a = 1;

		while (a <= 20) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
				
			}
			a++;

		}

		System.out.println("--------------Another way--------------- ");	
		
		int b= 2;
		while(b<=20) {
			System.out.print(b + " ");
			b+=2;
		}
		
		
		
	}

}

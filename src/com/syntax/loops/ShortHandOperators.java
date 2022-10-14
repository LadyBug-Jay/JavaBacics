package com.syntax.loops;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 35;
		a=a+8;
		System.out.println(a);//43 you are telling java to take the value of a which is 35 and then add 8 to it
		
		a=a-5;
		System.out.println(a);//38 (subtract 5 from 43)
		a=a*2;
		System.out.println(a);//76 (43 multiplied by 2)	
		
		// A shorter way to do this 
			
		int b=20;
		b+=9; // you are telling java to take the value of b which is 20 and then add 9 to it
		System.out.println(b);//29
		
		b*=2;
		System.out.println(b);//58 (29 multiplied by 2)
		
		b-=5;
		System.out.println(b);//53 (subtract 5 from 58)
		
		b%=4;
		System.out.println(b);//1 (Remainder after 4 divides 53)
		
		
		int c=18;
		c%=4;//(Remainder after 4 divides 18)
		System.out.println(c);	
		
		
		
		
		
		
		
		
		
		
		
	}

}

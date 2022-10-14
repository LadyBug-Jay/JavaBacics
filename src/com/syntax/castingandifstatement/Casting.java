package com.syntax.castingandifstatement;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte box1=127;
		short box2=3333;
		int box3=45454545;
		long box4=454545454;
		float box5=414564545;
		double box6=454545445;
		
		
		// To cast, we use parenthesis inside which we specify the data type we wish to convert to.
		//The use of parenthesis is mandatory during explicit casting but not during implicit casting. During implicit casting java does it automatically
		
		//Explicit Casting 
		byte box7=(byte)box2; // This is an explicit casting because we are trying to fit a bigger box into a smaller box (box 7 is of type byte and box 2 is of type short.) this will not be possible as there is not enough space. until we force it by introducing casting.
		float box8=(float)box6;
		int box9=(int)box4;
			System.out.println(box7);		
			System.out.println(box8);
			System.out.println(box9);
			
			// Implicit Casting
			long box10=box3;
			double box11=box5; // This is an implicit casting because we are trying to fit a smaller box into a bigger box which is actually possible as there is enough space (box 9 is of type long and box 3 is of type int) hence even though it is a cast, we do not need to use parenthesis
			short box12=box1;
			
			System.out.println(box10);
			System.out.println(box11);
			System.out.println(box12);
			
			
			
	int number=(int)15.2; 
	System.out.println(number);	
			
			
			
	}

}

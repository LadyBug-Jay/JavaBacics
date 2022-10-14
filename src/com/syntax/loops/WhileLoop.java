package com.syntax.loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int time=10;
	
	if(time<12) {
		System.out.println("Good morning");//Using a simple if statement, this code will execute 1 time
	}
	//Using a simple if statement, this code will execute 1 time
	//This is because usually by design codes executes from top to bottom, left to right 
	//so when java encounters an if statement it knows it has to execute the block of code based on a true condition
	
	while(time<12) {
		System.out.println("Good morning");// here time is 10 which is less than 12 so code will execute 1 time
	
		// using the while loop, this same code will enter a loop and execute numerous times.
		//This is because by design codes executes from top to bottom, left to right 
		//so when java encounters a while statement it knows it has to repeat the block of code based on a true condition
		// but in the case of the while statement java executes based on true condition and then it goes back to the while checks again and again, 
		//the conditions is of course still true so it continues endlessly and the code in the block of code will be executed continuously. This is called an infinite loop
		// The goal was to repeat a block of code without entering an infinite loop
		//To correct or prevent infinite loop we use increment or decrement to control the condition 
		
		time++;// here time got incremented to 11 which is still lesser than 12 so code executed a second time. on the third circle time will get incremented to 12 which of course is not less than 12, hence code execution stops
	
	}
	
	
	
		
		
		
	}

}

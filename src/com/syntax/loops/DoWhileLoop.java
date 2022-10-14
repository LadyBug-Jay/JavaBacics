package com.syntax.loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//When condition is true for while and do while loops
	int num=1;
	while(num<=3) {
		System.out.println("i am while loop");
		num++;
	}
	// for while, java will always see a condition which will determine if it will enter a block of code. if false it wont enter the block of code
	//For while, condition is always checked first
	
	System .out.println("------------------------------------------------------");
	
	
	
	//For do while, there is no condition first so it will execute the do block of code before it checks the while condition
	//For do while, condition is always checked last
	int num1=1;
	do { 
		System.out.println("i am do while loop");
		num1++;
	}while(num1<=3);
	
	
	System .out.println("------------------------------------------------------");
	
//When condition is false while and do while loops 
	int num2=1;
	while(num2>=3) {
		System.out.println("i am while loop");
		num2++;
	}
	
	int num3=1;
	do { 
		System.out.println("i am do while loop");
		num3++;
	}while(num3>=3);
	
	System .out.println("------------------------------------------------------");
	
	int num4=10;
	
	do {
		System.out.println(num4);
		num4++;
	}while(num4<=19);
	
	
	
	}

}

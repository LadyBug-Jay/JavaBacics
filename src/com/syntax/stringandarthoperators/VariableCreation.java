package com.syntax.stringandarthoperators;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//There are 3 ways to create a variable. One way to create a variable
		byte b=10; // create a variable and assign value on the same line
		
		//Second way to create a variable
		int i; //create a variable on one line
		i=100; //on the next line you assign the value
		
		//You only need to create a variable once and the use it as many times as i want
		
		//Third way to create variable. Note that create a variable is the same as saying declare a variable
		int num1, num2, num3; //create multiple variables on one line
		
		num1=100; //assign value. Note that assign value is the same as saying initialize variable
		num2=200;//assigned the value 200 to the box num2
		num3=300; //assigned the value 300 to the box num3
		
		//Reassigning value. One variable can hold only 1 value at a time.
		System.out.println(num2); //if i run this, the output will be 200 because of the order at which code is usually run. From to to bottom
		num2=2000; //i reassigned the value for box num2 to 2000
		
		System.out.println(num2); //if i run this the out put printed will be 2000 
		
	}

}

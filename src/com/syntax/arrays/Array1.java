package com.syntax.arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		
		char[] grade= {'A','B','C','D'};
		
		System.out.println(grade[1]);
		
		System.out.println("---------------------------------------");
		
	char[] grade2= new char[4];
	
	grade2[0]='A';
	grade2[1]='B';
	grade2[2]='C';
	grade2[3]='D';
	
	
	System.out.println(grade2[1]);
	
	int size=grade2.length;
	System.out.println("Size of array = "+size);
	} 

}

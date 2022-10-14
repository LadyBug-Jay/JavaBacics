package com.syntax.stringandarthoperators;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name="Judith";
	String lastname="Elemo";
	String grade="Batch 14";
	String city="Yaba";
	String state="Lagos";
	String phone="08034853691";
	
	System.out.println("My name is " +name +" and my lastname is "+lastname+".");
	System.out.println("I am a " +grade +" Student");
	System.out.println("I live in " +city +" and "+state);
	System.out.println("And my phone number is " +phone);
	
	//Reassigned Variables
	grade="B+";
	city="Ijaba";
	state="Oyo";
	phone="08034663691";
	
	System.out.println("--------------------------------------");
	System.out.println("My name is " +name +" and i moved to new city "+city +" and new state "+state);
	System.out.println("I am a "+grade +" Student");
	System.out.println("My new phone number is " +phone);
	
//Rules for identifiers. identifiers mean names as in variables, methods 
	//Rule number 1: You cannot use keywords as identifiers. example String new="Hello"; will give an error because new is already a keyword
	//Rule number 2: You cannot add spaces in identifiers example Last name is wrong it should be Lastname
	//Rule number 3: Identifiers cannot start with numbers example int 1number=123; would give an error. you can however pot numbers anywhere after 1 character. example int number1=123;
	//Rule  number4: Identifiers cannot contain any special character with the exception of $, _(underscore) example boolean hello!=true; will give error but double $price=9.98; will not and float _price1_=1.99F; will not too 
	

	
	
	
	}

}

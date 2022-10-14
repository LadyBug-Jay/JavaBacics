package com.syntax.castingandifstatement;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double myBankBalance=2000;
	double theAmountToTransfer=2500;
	
	if(myBankBalance>theAmountToTransfer) 
	{
		System.out.println("Transfer successful");
	}
	else 
	{
	System.out.println("Please try again not enough balance");
	}	
	
	int a=15;
	int b=20;
	
	if(a>b) 
	{
		System.out.println("correct");
	}
	else 
	{
		System.out.println("Incorrect");
	}	
	
	double money=5.00;
	double kfcBurger=11.00;
	
	if(money>kfcBurger) 
	{
		System.out.println("yes i can enjoy a burger");
	}
	else 
	{
		System.out.println("I should make something at home");
	}
	
	
	
	boolean isHungry=true;
	
	if(isHungry) 
	{
		System.out.println("Lets eat something yummy");
	}
	else 
	{
		System.out.println("Lets watch and do some coding from youtube");
	}
	
	int g=3;
	int h=2;
	
	if(g>h) 
	{
		System.out.println("There is a true statement inside paranthesis");
	}
	else 
	{
		System.out.println("There is a false statement inside paranthesis");
	}
	
	int myMoney=100000;
	
	if(myMoney>10000) 
	{
		System.out.println("I am rich");
		System.out.println("I can go on vacation");
		System.out.println("I can buy a car");
	}
	else	
	{
		System.out.println("I need to save more");
	}
	
	
	int ourMoney=100000;
	
	if(ourMoney>=65000)
	{
		System.out.println("We can move to Canada");
	}
	else 
	{
		System.out.println("We need to save more");
	}

	if(ourMoney==6500) {
		System.out.println("We are at a balance");
	}
	else 
	{
		System.out.println("We are not at a balance");
	}
	
	int number=19;
	
	if (number!=18) 
	{
		System.out.println("This is not number 18");
	}
	
	
	int day=8;
	
	if(day==1) 
	{
		System.out.println("Monday");	
	}
	else if(day==2)
	{
		System.out.println("Tuesday");
	}
	else if(day==3)
	{
		System.out.println("Wedesday");
	}
	else if(day==4)
	{
		System.out.println("Thursday");
	}
	else if(day==5)
	{
		System.out.println("Fridayday");
	}
	else if(day==6)
	{
		System.out.println("Saturdayday");
	}
	else if(day==7)
	{
		System.out.println("Sunday");
	}
	else
	{
		System.out.println("Please enter a valid number between 1 and 7");
	}
	
	//Non Primitive data type
	String name="Judith";
	
	if(name.equals("Judith")) // for non primitive data types we can't use "==" sign. We use ".equals"
	{
		System.out.println("I love Amabelle");
	}
	else 
	{
		System.out.println("This is not Judith");
	}
	
	
	
	
	
	}

}

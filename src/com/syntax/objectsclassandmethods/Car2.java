package com.syntax.class11;

public class Car2 {
	
//Create a class named 'Main' with specific attributes.

//Create two objects of that class in which you will be assigning the following values and then print them.

//carColor='Black'

	//carYear=2019

	//carMake='BMW'

	//carColor='White'

	//carYear=2018

	//carMake='Toyota'

	//Expected Output:*
	//Car color is Black and car year is 2019 and car model is BMW
	//Car color is White and car year is 2018 and car model is Toyota

	String carColor;
	int carYear;
	  String carMake;

	  void addCarDetails(){
	     System.out.println("Car color is "+carColor+ " and car year is "+carYear+" and car model is "+ carMake);
	  }

	  public static void main(String[]args){
	    Car2 sedan=new Car2();
	    sedan.carColor="Black";
	    sedan.carYear=2019;
	    sedan.carMake="BMW";
	    sedan.addCarDetails();

	    Car2 suv=new Car2();
	    suv.carColor="White";
	    suv.carYear=2018;
	    suv.carMake="Toyota";
	    suv.addCarDetails();
	  }

	
	
	

	




}

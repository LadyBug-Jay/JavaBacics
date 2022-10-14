package com.syntax.class04.homework;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Specify the name of your city in the console and click on enter key.");		
  
   String city=scanner.nextLine();
   System.out.println("Specify the temperature of your city in fahrenheit and click on enter key.");		
   
   double fahrenheittemp=scanner.nextDouble();
   float celsiustemp=(float)(fahrenheittemp-32)/1.8f;
  
   
	System.out.println("The temperature in "+city+" is "+celsiustemp+"°C");
	
 
	
	
  
	
	
	

	}

}

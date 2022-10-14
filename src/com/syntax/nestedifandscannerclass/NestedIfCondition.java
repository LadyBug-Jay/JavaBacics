package com.syntax.nestedifandscannerclass;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int time=9;
	String day= "Monday";
	
	if(day.equals("Monday"))
	{
		if(time>7)
		{
			System.out.println("Lets go to the office");
		}
		if(time<6)
		{
			System.out.println("Lets sleep more");
		}
	}
		
		
		
     double moneyInMyAccount=2000;
     String season="Spring";
     
     if(season.equals("Spring")) 
     {
    	 if(moneyInMyAccount>30000)
    	 {
    		 System.out.println("Lets go on vacation");
    	 }	 
     else
     {
    	 System.out.println("I need to save more");
     }
            
     }      
	
	
	
	
	
	
	
	}

}

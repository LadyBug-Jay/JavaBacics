package com.syntax.class11;

public class Person2 {
	
	//Create a class 'Person2' (please do not make it public as Repl will give you an error)

//Inside class declare a String variable 'name' and integer variable 'roll_no'. 

//Create an object of the class and assign the value of 2 to roll_no and value of "John" to name

//Your program should print the following:

//Name is John and roll number is 2
	
	String name;
    int roll_no;
   

   //Behaviour
   void description(){
     System.out.println("Name is "+name+ " and roll number is "+ roll_no);
   }

 
    public static void main(String[]args){
      Person2 person=new Person2();
      person.name="John";
      person.roll_no=2;
      person.description();
      
      
      Person2 person1=new Person2();
      person1.name="James";
      person1.roll_no=3;
      person1.description();
      
      
      
      
    }


}

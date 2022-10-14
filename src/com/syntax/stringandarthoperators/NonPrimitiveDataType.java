package com.syntax.stringandarthoperators;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String is just 1 example of primitive data type	
		
	String name="Judith";
	String address="234 cherry lane";
	String phone="080 34 78 22";
	
	int age=17;
	//String age="17" Anything you put in '' is treated as a string. Age is always an integer and integers are never put in quotes.
	
	String character="A";
	
	//ctr=space>> auto complete the statement
	//syso =ctlr +space
	
	//System.out.println(name);
	
	//To concatenate we use the + sign i.e when we want to attach any value int, double, boolean, char, string etc we use +
	// if i want to say "My name is Judith, i already have a value Judith stored inside the box name
	//System.out.println("My name is " +name);
	
	//if i want to say Judith is 17, i already have the value judith stored in the variable name and 17 stored in the variable age. Remember that spaces matter only inside double quotes.
	//System.out.println(name+" is "+age);
	
	
	String fruit="apple";
	double price=1.99;
	
	//System.out.println("The price of the " +fruit+" is "+price);
	
	//Reassigned
	
	fruit="Mango";
	price=5.99;
	
	//System.out.println("----------------------------");
	//System.out.println("The price of the " +fruit+" is "+price);
	
	
	String firstname="Judith";
	String lastname="Elemo";
	String fullname=firstname+" "+lastname;
	
	//System.out.println("----------------------------");
	//System.out.println(fullname);
	
	int houseNo=11;
	int apartmentNo=4;
	String streetName="Joseph Harrison street";
	String city="Yaba";
	String country="Nigeria";
	String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
	
	System.out.println("----------------------------");
	System.out.println(fullAddress);
	
	
	}

}

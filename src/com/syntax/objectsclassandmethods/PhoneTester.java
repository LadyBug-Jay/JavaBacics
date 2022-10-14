package com.syntax.class11;

public class PhoneTester {

	public static void main(String[] args) {
		
		
	    /*All the while we have been creating the objects of a class inside the same class.
	     * We can also create the objects of a class inside another class
         * if class whose object we are creating
         * is present inside the same package
         * we don't need to import it.
         */
        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.model="Iphone 14 Pro Max";
        iphone.year=2022;
        iphone.storage=128;
        iphone.makeCall();//Here you are calling the methods from the class "Phone"

        //new Phone() => To Create the object
        Phone samsungPhone=new Phone();
        samsungPhone.model="S22 Ultra";
        samsungPhone.make="Samsng";
        samsungPhone.year=2022;
        samsungPhone.makeCall();
        samsungPhone.takePictures();

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

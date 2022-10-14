package com.syntax.class11;

public class Phone {

	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with
	// specific attributes and behaviors.

	// First state the attributes or things you can use to define a phone

	String make;
	String model;
	String color;
	int year;
	int storage;

	// secondly define the behavior or thing it can be used for
	// we can also use the attributes stated when defining the behavior

	void makeCall() {
		System.out.println("Making a call using " + model);
	}

	void takePictures() {
		System.out.println("Taking Pictures using " + model);
	}

	void browseInternet() {
		System.out.println("Browsing the internet using " + model);
	}
}

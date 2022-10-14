package com.syntax.class11;

public class Dog2 {
//Create a Class Dog2 
//In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//The output of the program should be as following:
//Husky can bark
//Husky can run
//Husky can play
//Bulldog can bark
//Bulldog can run
//Bulldog can play
//Labrador can bark
//Labrador can run
//Labrador can play

	 String breed;
	  String name;
	  String color;

	  void bark(){
	    System.out.println(name+" can bark");
	  }

	void run(){
	    System.out.println(name+" can run");
	  }

	void play(){
	    System.out.println(name+" can play");
	  }

	public static void main(String[]args){
		Dog2 husky=new Dog2();
	  husky.name="Husky";
	  husky.breed="Siberian";
	  husky.color="Black and White";
	  husky.bark();
	  husky.run();
	  husky.play();

	  Dog2 bulldog=new Dog2();
	  bulldog.name="Bulldog";
	  bulldog.breed="Old English";
	  bulldog.color="Black";
	  bulldog.bark();
	  bulldog.run();
	  bulldog.play();

	  Dog2 labrador=new Dog2();
	  labrador.name="Labrador";
	  labrador.breed="Retriver";
	  labrador.color="Black";
	  labrador.bark();
	  labrador.run();
	  labrador.play();

	  
	}

	
	
	
	
	
}

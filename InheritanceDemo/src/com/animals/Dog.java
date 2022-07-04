package com.animals;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);//construct super type 
	}

@Override
public void makeSound() {
	System.out.println("Bark...");
}	
	
}

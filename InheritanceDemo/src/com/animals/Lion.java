package com.animals;

public class Lion extends Animal{

	public Lion(String name) {
		super(name);
	}
 @Override
public void makeSound() {
	System.out.println(super.getName() + " Roar...");
}
}

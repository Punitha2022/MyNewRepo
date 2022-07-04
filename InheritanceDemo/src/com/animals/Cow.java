package com.animals;

public class Cow extends Animal {

	public Cow(String name) {
		super(name);
	}
@Override
public void makeSound() {
	System.out.println("Mooo....");
}
}

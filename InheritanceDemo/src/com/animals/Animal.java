package com.animals;

public abstract class Animal {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Animal(String name) {
	super();
	this.name = name;
}

public static void methodA() {
	System.out.println("Static method methodA in Animal class");
}
//contract to the subclass. 
//if any subclass extends this Animal class
//it has to provide implementation for this makeSound();
//abstract method has only method definition. NO IMPLEMENTATION
public abstract void makeSound();
}






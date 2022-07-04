package com.animals;
public class Cat extends Animal {
	public Cat(String name) {
		super(name);//construct super type - Animal
	}
  @Override
public void makeSound() {
   System.out.println("Meow....");	
}
//Cannot override static method
public static void methodA() {
	System.out.println("Static method methodA in Cat class");
}
}
//Create a class BankAccount
//Three instance variables - accno:String,balance:double,name:string
//parameterized constructor (3 parameters)
//getters and setters

//withdrawal(double amount) 
//-> deduct the amount if amount is not sufficient display the message

//deposit(double amount)
//add the amount with balance


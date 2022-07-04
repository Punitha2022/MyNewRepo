package com.animals;

public class DriverMain {

	public static void main(String[] args) {

//		 Animal animals[]=new Animal[5];
//		 animals[0]=new Animal("animal");
//		 animals[1]=new Cat("cat");
//		 animals[2]=new Dog("Dog");
//		 animals[3]=new Cat("BrownCat");
//		 animals[4]=new Dog("BrownDog");
//		 
//		 for (int i = 0; i < animals.length; i++) {
//			animals[i].makeSound();
//		}
		
        //Subtype is referring to Super type - typecast
		
//		Dog dog1=(Dog) new Animal("MyDog");//TypeCasting - Downcasting
//		dog1.makeSound();//1
		
		//Polymorphic behavior a1.makeSound() - 3 different behavior
		//Inheritance and overriding
		 Animal a1=new Cat("Cat1");  
		 a1.makeSound();//2
	     a1=new Dog("Dog1");
	     a1.makeSound();//3
	     //Abstract class cannot be instantiated
//		 a1=new Animal("animal");
//		 a1.makeSound();//4
		 a1=new Cow("Cow..");
		 a1.makeSound();//5
		 a1=new Lion("Lion");
		 a1.makeSound();
		 Cat.methodA();//compile time
		 Animal.methodA();//compile time
		 
	}

}






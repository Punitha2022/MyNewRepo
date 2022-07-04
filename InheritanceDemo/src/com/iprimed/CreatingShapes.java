package com.iprimed;

public class CreatingShapes {
public static void main(String[] args) {
	Shape s1=new Shape();
	Shape s2=new Shape("Red",3);
	
	//call calculateArea() method in Superclass (Shape)
	System.out.println("Color of s1 " + s1.getColor());
	System.out.println("No of sides for s1 " + s1.getNoOfSides());
	System.out.println("Area of s1 " + s1.calculateArea());
	System.out.println("");
	
	System.out.println("Color of s2 " + s2.getColor());
	System.out.println("No of sides for s2 " + s2.getNoOfSides());
	System.out.println("Area of s2 " + s2.calculateArea());
	
	Triangle t1=new Triangle("Yellow", 3, 4, 7);
	//call calculateArea() method in Triangle class. Since t1 is of Type Triangle
	System.out.println("Color of triangle " + t1.getColor());
	System.out.println("No of sides for triangle " + t1.getNoOfSides());
	System.out.println("Area of t1 " + t1.calculateArea());
	System.out.println("");
	
	Square square=new Square("Black", 4, 6.5);
	System.out.println("Color of square " + square.getColor());
	System.out.println("No.. of sides for square " + square.getNoOfSides());
	System.out.println("Area of square " +square.calculateArea());
}
}




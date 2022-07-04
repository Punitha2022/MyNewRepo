package com.iprimed;

public class Triangle extends Shape {//Triangle of subclass of Shape class
private double base;
private double height;
public Triangle(String color, int noOfSides, double base, double height) {
	//constructor call should be the first statement in the constructor
	super(color, noOfSides);//calling the super class constructor
	this.base = base;
	this.height = height;
	
}
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
//override the method calculateArea() which is a superclass method
//implement superclass method in a different way
@Override //override annotation
	public double calculateArea() {
		// TODO Auto-generated method stub
	    System.out.println("Calculate Area in Triangle");
		return 0.5*this.base*this.height;
	}


}

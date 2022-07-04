package com.iprimed;

public class Square extends Shape{
private double sides;

public Square(String color, int noOfSides, double sides) {
	super(color, noOfSides);
	this.sides = sides;
}

public double getSides() {
	return sides;
}

public void setSides(double sides) {
	this.sides = sides;
}
@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
	System.out.println("Calculate Area in Square");
		return sides*sides;
	}
}

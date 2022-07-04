package com.iprimed;

public class Shape {
private String color;
private int noOfSides;
public Shape(String color, int noOfSides) {
	super();
	this.color = color;
	this.noOfSides = noOfSides;
}
public Shape() {
	super();
	// TODO Auto-generated constructor stub
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getNoOfSides() {
	return noOfSides;
}
public void setNoOfSides(int noOfSides) {
	this.noOfSides = noOfSides;
}
public double calculateArea() {
	System.out.println("Calculate Area in Shape");
	return 0;
}

}






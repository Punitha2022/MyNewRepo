package com.iprimed;

public class Child extends Parent {
public int a;
public Child(int a1,int a2) {
	super(a1);//super class constructor
	this.a=a2;
}
public void printValues() {
	System.out.println("Parent class a value " + super.getA());
	System.out.println("Child class a value " + this.a);
}
public static void main(String[] args) {
	Child c=new Child(10,20);
	c.printValues();
}
}

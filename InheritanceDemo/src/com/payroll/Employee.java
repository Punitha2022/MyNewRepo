package com.payroll;

public abstract class Employee {
private int id;
private String name;
private double baseSalary;
public Employee(int id, String name, double baseSalary) {
	super();
	this.id = id;
	this.name = name;
	this.baseSalary = baseSalary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

public double computePay() {
	return this.baseSalary;
}
//contract
public abstract double extraPay();

public final void displayPaySlip() {
	System.out.println("Id           " + this.id);
	System.out.println("Name         " + this.name);
	System.out.println("Extra Pay    " + this.extraPay());//call extraPay in subclasses
	System.out.println("Total Salary " + this.computePay()); //call computePay in subclass
}



}

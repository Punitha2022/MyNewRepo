package com.payroll;

public class ContractEmployee extends Employee {
private int hours;
private double rate;
public ContractEmployee(int id, String name, double baseSalary, int hours, double rate) {
	super(id, name, baseSalary);
	this.hours = hours;
	this.rate = rate;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}

@Override
	public double computePay() {
		
		double totalPay=super.getBaseSalary() + this.hours * this.rate;	
		return totalPay;
	}
//   @Override
//	public void displayPaySlip() {
//	    System.out.print("Id " + super.getId());
//		System.out.print(" Name " + super.getName());
//		double extraPay=this.hours * this.rate;
//		System.out.print(" Extra Pay " + extraPay);
//		System.out.println("Total Salary " + this.computePay());
//	}
@Override
public double extraPay() {
	return this.hours * this.rate;
}
}



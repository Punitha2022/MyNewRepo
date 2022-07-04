package com.payroll;

public class PermanentEmployee extends Employee {
private double allowance;

public PermanentEmployee(int id, String name, double baseSalary, double allowance) {
	super(id, name, baseSalary);
	this.allowance = allowance;
}

public double getAllowance() {
	return allowance;
}

public void setAllowance(double allowance) {
	this.allowance = allowance;
}

@Override
	public double computePay() {
		return super.getBaseSalary() + this.allowance;
	}

@Override
	public double extraPay() {
		return this.allowance;
	}
//@Override
//	public void displayPaySlip() {
//		System.out.println("Id " + super.getId());
//		System.out.println("Name " + super.getName());
//		System.out.println("Extra pay " + this.allowance );
//		System.out.println("Total Pay " + this.computePay());
//	}
}

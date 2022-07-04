package com.payroll;

public class Manager extends Employee {
private double bonus;
private double rate;
public Manager(int id, String name, double baseSalary, double bonus, double rate) {
	super(id, name, baseSalary);
	this.bonus = bonus;
	if(rate>=1 && rate<=5)//check the input whether the rate is between the range 1 and 5
	this.rate = rate;
	else this.rate=1;//else assign rate as 1
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
@Override
public double extraPay() {
	return this.bonus * (this.rate/5);
}
//Method name and parameters (same number and type of parameters)
//cannot change the return type also
@Override
	public double computePay() { //method signature cannot be changed.
		return this.extraPay() + super.getBaseSalary();
	}
}

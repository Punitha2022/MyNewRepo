package com.payroll;

public class PayRoll {

	public static void main(String[] args) {
		Employee emp1=new ContractEmployee(1,"John" , 10000, 50, 2000);
		Employee emp2=new ContractEmployee(2, "James", 12000, 60, 1900);
		Employee emp3=new PermanentEmployee(100, "Smith", 25000, 20000);
		Employee emp4=new Manager(200,"Joe",20000,5000,5);
		Employee emp5=new Manager(201,"Jack",23000,5000,2.5);
		Employee emp6=new Manager(202,"Jim",22000,4000,10);
		//Polymorphic behaviour
		//Same Type(Employee), Same method but different output
		//We are achieving this because of inheritance and overriding
		
		emp1.displayPaySlip();//1 displayPaySlip() in ContractEmployee
		System.out.println("");
		emp2.displayPaySlip();//2 displayPaySlip() in ContractEmployee
		System.out.println("");
		emp3.displayPaySlip();//3 displayPaySlip() in PermanentEmployee
		System.out.println("");
		emp4.displayPaySlip();
		System.out.println("");
		emp5.displayPaySlip();
		System.out.println("");
		emp6.displayPaySlip();
		System.out.println("");
		//convert reference to a string by calling toString() in object class
		System.out.println("Emp6 " + emp6);
        System.out.println("Emp6 " + emp6.toString());
        System.out.println("Emp5 " + emp5.toString());
	}

}

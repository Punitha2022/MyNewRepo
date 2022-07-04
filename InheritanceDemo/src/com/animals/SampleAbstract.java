package com.animals;

public abstract class SampleAbstract {
public static void methodA() {
	System.out.println("methodA");
}
public  void methodB() {
	System.out.println("methodB");
}


//contract 
protected abstract void methodC();
public abstract void methodD();

//Final version of the implementation
//it cannot be overridden
public final void methodE() {
	System.out.println("Method E");
}

public static void main(String[] args) {
	//SampleAbstract sa=new SampleAbstract();
}
}

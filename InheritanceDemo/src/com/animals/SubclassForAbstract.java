package com.animals;

public class SubclassForAbstract extends SampleAbstract {

	
	
	@Override
	public void methodC() {
		System.out.println("MethodC ");
		
	}

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	SampleAbstract sa=new SubclassForAbstract();
}
}

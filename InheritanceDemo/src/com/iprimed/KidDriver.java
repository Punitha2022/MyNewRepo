package com.iprimed;

public class KidDriver {

	public static void main(String[] args) {
		Kid k=new Kid("Jack",3);
		System.out.println(k);
		int x=10; int y =10; int z=10; int x1, y1, z1;
		x1=++y;  
		y1=z++;
		z1=z; 
      System.out.println(x1 + " " + y1 + " " + z1);

	}

}

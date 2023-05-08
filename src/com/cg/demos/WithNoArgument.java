package com.cg.demos;

@FunctionalInterface //it's optional
interface Cab{
	public  void booking();
}

public class WithNoArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for functional interface we no need to create a class to implement we can simply do the following by using LE
		Cab c = ()-> System.out.println("Cab is booked");
		c.booking();

	}

}

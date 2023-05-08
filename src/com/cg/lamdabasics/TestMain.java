package com.cg.lamdabasics;

public class TestMain {

	public static void main(String[] args) {
		//1st way
		
		A a = new C();
		a.myMethod1();
		//2nd way
		A a1 = ()->System.out.println("insid my method");
		a1.myMethod1();
	}

}

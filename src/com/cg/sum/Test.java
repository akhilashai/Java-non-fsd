package com.cg.sum;

public class Test {

	public static void main(String[] args) {
		Sum s = (x,y)->System.out.println("sum : "+(x+y));
		s.add(10,20);
	}

}

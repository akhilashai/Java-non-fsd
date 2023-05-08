package com.cg.demos;

interface Value{
	public abstract void var(int a);
}


public class WithOneArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v = a -> System.out.println(a);
		v.var(10);
		
	}

}

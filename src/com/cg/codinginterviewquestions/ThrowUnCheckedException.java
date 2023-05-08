package com.cg.codinginterviewquestions;

public class ThrowUnCheckedException {

	public static void main(String[] args){
		int a =10;
		int b=0;
		try {
		int c = a/b;
		throw new ArithmeticException("b value should not be zero");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}

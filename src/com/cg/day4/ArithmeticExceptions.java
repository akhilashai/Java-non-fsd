package com.cg.day4;

import java.util.Scanner;

public class ArithmeticExceptions {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a and b value");
		int a = scan.nextInt();
		int b = scan.nextInt();
		try
		{
		int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}

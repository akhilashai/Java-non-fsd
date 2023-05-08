package com.cg.testpreparation;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number we will find factorial of that number");
		int num = scan.nextInt();
		int fact=1;
		for(int i = num; i>0; i--)
		{
			fact = fact* i;
		}
		System.out.println("factorial of number"+num+" is"+ fact);
		scan.close();
	}

}

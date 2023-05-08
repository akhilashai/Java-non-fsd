package com.cg.testpreparation;

import java.util.Scanner;

public class EvenAndOddNumbers {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		if(n%2 ==0)
		{
			System.out.println("it is even");
		}
		else
		{
			System.out.println("it is odd");
		}
		
	}

}

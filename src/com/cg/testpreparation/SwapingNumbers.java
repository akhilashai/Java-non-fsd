package com.cg.testpreparation;

import java.util.Scanner;

public class SwapingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a and b value ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Before swaping your values are a = "+ a +" "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swaping your values are a = "+a +" "+b);

	}

}

package com.cg.day4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a= scan.nextInt();
		int b = scan.nextInt();
		CalEnum cal = CalEnum.div;
		switch(cal)
		{
		case sum:
			System.out.println(a+b);
			break;
		case sub:
			System.out.println(a-b);
			break;
		case mul:
				System.out.println(a*b);
				break;
		case div:
			System.out.println(a/b);
			break;
		
			
		}
		
	}

}

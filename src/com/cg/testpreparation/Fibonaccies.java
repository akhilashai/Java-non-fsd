package com.cg.testpreparation;

import java.util.Scanner;

public class Fibonaccies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a =0,b=1;
		System.out.println("enter how many fibonaccies numbers you want");
		int n = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<n; i++)
		{
			int c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		scan.close();
	}

}

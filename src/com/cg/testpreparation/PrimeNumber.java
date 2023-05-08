package com.cg.testpreparation;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int count =0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
				if(count==3)
				{
					break;
				}
			
			}
			
		}
		if(count==2)
		{
			System.out.println("It is prime number");
		}
		else 
		{
			System.out.println("It is not a prime number");
		}
		scan.close();

	}

}

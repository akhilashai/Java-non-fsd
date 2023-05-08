package com.cg.testpreparation;

import java.util.Scanner;

public class ReverseingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a three or more digits number we will reverse it");
		int num = scan.nextInt();
		int temp = num;
		int reverse =0;
		while(num != 0)
		{
			int r = num%10;
			
			reverse = reverse*10+r;
			
			num = num/10;
			
			
		}
		System.out.println(reverse);
		if(temp==reverse)
		{
			System.out.println("it is anagram");
		}
		else
		{
			System.out.println("it is not a anagram");
		}

	}

}

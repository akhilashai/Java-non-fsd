package com.cg.day4;

import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		try
		{
		String name = scan.next();
		throw new CustomException("please enter valid string instead of null");
		}
		catch(CustomException e)
		{
			System.out.println(e);
		}
		
		
	}

}

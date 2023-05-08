package com.cg.codinginterviewquestions;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		
		int c ;
		try(Scanner scan = new Scanner(System.in))
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			 c = a/b;
			 System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
	}

}

package com.cg.codinginterviewquestions;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) throws NotValid {
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		if (age<0)
		{
			throw new NotValid("negative values are not valid in age ");
		}
		
	}

}

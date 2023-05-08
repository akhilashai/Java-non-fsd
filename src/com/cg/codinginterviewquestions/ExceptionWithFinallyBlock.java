package com.cg.codinginterviewquestions;

import java.util.Scanner;

public class ExceptionWithFinallyBlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "akhila";
		try {
		char ch = name.charAt(6);
		System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			scan.close();
		}
	}

}

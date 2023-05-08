package com.cg.codinginterviewquestions;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two digits ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("sum of digits :"+ a+b);
		scan.close();
		//if not close scanner class garbage collector will not collect hence it is a memory leak.
	}

}

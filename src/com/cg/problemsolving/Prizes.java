package com.cg.problemsolving;

import java.util.Scanner;

public class Prizes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for(int i=0; i< testCases; i++)
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			System.out.println((x*10)+(y*90));
		}
	}

}

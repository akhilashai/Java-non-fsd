package com.cg.problemsolving;

import java.util.Scanner;

public class AgeLimit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i=0; i< testCase; i++)
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			if(z>=x && z<y)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}

}

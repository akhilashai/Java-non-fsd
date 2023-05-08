package com.cg.problemsolving;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Deque deque = new ArrayDeque();
		Set set = new HashSet();
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int num = scan.nextInt();
			deque.add(num);
			
		}
		
		
		
		
		
		
	}

}

package com.cg.codinginterviewquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferReader {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name ");
		String name = br.readLine();
		System.out.println("your name is "+name);
		
	}

}

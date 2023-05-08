package com.cg.testpreparation;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word I will tell you it is anagram or not");
		String word = scan.next();
		String reverse = "";
		//copy the string
		String copy = String.valueOf(word);
		for(int i=word.length()-1; i>=0;i--)
		{
			char ch = word.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(reverse);
		if(copy.equals(reverse))
		{
			System.out.println("It is anagram");
		}
		else
		{
			System.out.println("It is not anagram");
		}

	}

}

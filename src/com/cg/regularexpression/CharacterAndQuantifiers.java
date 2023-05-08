package com.cg.regularexpression;

import java.util.regex.Pattern;

public class CharacterAndQuantifiers {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[abc]", "abc"));
		//except abc
		System.out.println(Pattern.matches("[^abc]", "abc"));
		//? means 0 or 1
		System.out.println(Pattern.matches("[abc]?", "aa"));
		//0 or more times
		System.out.println(Pattern.matches("[abc]*", "abbbbbc"));
		//represent not a digit
		System.out.println(Pattern.matches("\\D", "abcs"));
	}

}

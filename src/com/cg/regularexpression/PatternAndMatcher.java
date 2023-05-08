package com.cg.regularexpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternAndMatcher {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher("abcxyzabcmno");
		while(matcher.find())
		{
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println(matcher.group());
		}

	}

}

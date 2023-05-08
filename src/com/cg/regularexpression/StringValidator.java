package com.cg.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

	public static void main(String[] args) {
		
	Pattern pattern	=Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
		Matcher matcher = pattern.matcher("akhilashaik227@gmail.com");
		if(matcher.matches())
		{
			System.out.println("valid email id");
		}
		else
		{
			System.out.println("invalid email id");
		}
	}

}

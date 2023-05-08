package com.cg.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {

	public static void main(String[] args) {
		
	String email = "6301096807";
		if(email.matches("^\\d{10}$"))
		{
			System.out.println("valid mobile no");
		}
		else
		{
			System.out.println("invalid mobile no");
		}
	}

}

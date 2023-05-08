package com.cg.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailId {

	public static void main(String[] args) {
		
	String email = "akhilashaik227gmail.com";
		if(email.matches("^[a-zA-z0-9_.-]+@[a-zA-z0-9_.-]+$"))
		{
			System.out.println("valid email id");
		}
		else
		{
			System.out.println("invalid email id");
		}
	}

}

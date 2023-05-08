package com.cg.collectors.groupingBy;

import java.util.StringJoiner;

/*
 * StringJoiners are used to join the sequence of characters seperated by delimiter and you can also add prefix and suffix 
 *
 * stringJoiner constructors are
 * 
 * public StringJoiner(delimiter);
 * public StringJoiner(delimiter, prefix, sufix);
 * to add characters to the string joiners we can use add() method
 */


public class StringJoiners {

	public static void main(String[] args) {
		//using delimiter parameter constructor	
		StringJoiner str = new StringJoiner(" ,");
		str.add("akhila");
		str.add("haleema");
		str.add("nagoorvali");
		str.add("begum");
		str.add("imran");
		System.out.println(str);
		
		//using delimiter , prefix and suffix parameter constructor
		StringJoiner s = new StringJoiner(",","[","]");
		s.add("telugu");
		s.add("hindi");
		s.add("english");
		s.add("maths");
		s.add("science");
		s.add("social");
		System.out.println(s);
		
		
		
	}

}

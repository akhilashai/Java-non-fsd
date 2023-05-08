package com.cg.mockinterview;

import java.util.StringJoiner;

public class StringJoiners {

	public static void main(String[] args) {
		
		StringJoiner str = new StringJoiner(",","#","#");
		str.add("akhila");
		str.add("haleema");
		str.add("imran");
		System.out.println(str);
		
	}

}

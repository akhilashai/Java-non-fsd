package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindingString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("akhila","bindu","madhu salani","kavya sri"," dulqar salman");
		list.stream().filter(x->x.length()>9).forEach(System.out::println);
		
	}

}

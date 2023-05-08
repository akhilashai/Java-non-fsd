package com.cg.collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("rani", "is "," a","good ","girl");
		  String collect = list.stream().map(x->x).collect(Collectors.joining(","));
		System.out.println(collect);
	
		String collect1 = list.stream().map(x->x).collect(Collectors.joining(" "));
		System.out.println(collect1);
	
	}

}

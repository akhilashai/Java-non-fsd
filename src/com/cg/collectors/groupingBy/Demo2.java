package com.cg.collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("akhila","haleema","begum","akhila","haleema","begum","haleema","begum");
		Map<String, Long > map = names.stream().collect(Collectors.groupingBy(x-> x, Collectors.counting()));
		System.out.println(map);
		
	}

}

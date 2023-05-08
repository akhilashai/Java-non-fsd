package com.cg.collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer > list = Arrays.asList(1,6,5,7,4,3,2,1);
		 Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(x-> x , Collectors.counting()));
		System.out.println(collect);
		 Map<Integer, List<Integer>> collect1 = list.stream().collect(Collectors.groupingBy(x-> x , Collectors.toList()));
			System.out.println(collect1);
	}

}

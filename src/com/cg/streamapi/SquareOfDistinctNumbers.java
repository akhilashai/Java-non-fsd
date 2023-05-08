package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SquareOfDistinctNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		Set<Integer> set = new HashSet<>();
		list.stream().distinct().map(x->x*x).forEach(System.out::println);
		
		
	}

}

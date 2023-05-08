package com.cg.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,77,44,1,20,409,97,88);
		list.stream().sorted().forEach(System.out::println);
		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
		Optional<Integer> min = list.stream().min(Comparator.reverseOrder());
		System.out.println(min);
	}

}

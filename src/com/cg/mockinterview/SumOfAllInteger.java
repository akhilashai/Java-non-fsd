package com.cg.mockinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllInteger {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(77,6,5,44,100);
		//counting numbers
		Long collect = list.stream().collect(Collectors.counting());
		System.out.println(collect);
		//summing
		Integer sum = list.stream().collect(Collectors.summingInt(x->x));
		System.out.println("sum : "+sum);
		//another way to sum
		System.out.println(list.stream().mapToInt((Integer:: intValue)).sum());
		
	}

}

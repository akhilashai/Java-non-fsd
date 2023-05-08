package com.cg.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMiniValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(22,33,88,99,100,4,7);
		
		//one way to find minimum value of a list
		list.stream().min(Integer :: compareTo).ifPresent(System.out::println);
		
		
		//to get maximum value of a list
		list.stream().min(Comparator.reverseOrder()).ifPresent(System.out::println);

		list.stream().max(Integer:: compare).ifPresent(System.out::println);
		
	}

}

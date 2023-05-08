package com.cg.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class SumAndNoOfTheElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,6,5,7,9,22,99,88,67);
		Integer collect = list.stream().collect(Collectors.summingInt(x-> x));
		System.out.println("sum of the elements:  "+collect);
		
		Long total = list.stream().collect(Collectors.counting());
		System.out.println("No.of the elements:  "+total);
		
	}

}

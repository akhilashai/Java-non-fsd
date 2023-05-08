package com.cg.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,33,77,89,94,53,24,53,81);
		Long collect = list.stream().collect(Collectors.counting());
		System.out.println("count = "+collect);
		list.stream().min(Integer :: compare).ifPresent(x->System.out.println("min = "+x));
		list.stream().min(Collections.reverseOrder()).ifPresent(x->System.out.println("max = "+x));
		Integer sum = list.stream().collect(Collectors.summingInt(x->x));
		 System.out.println("sum = "+sum);
		Double avg = list.stream().collect(Collectors.averagingInt(x->x));
		 System.out.println("average = "+avg);
	}

}

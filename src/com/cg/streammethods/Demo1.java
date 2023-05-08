package com.cg.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * non-terminal / processing methods
 * distinct()
 * limit()
 * 
 * terminal methods
 * count()
 * forEach()
 */

public class Demo1 {

	public static void main(String[] args) {
		
		List<String > list = Arrays.asList("bus","car","auto","bike","cycle","train","train","auto","bus");
		//distinct() - used to find unique keys means removing duplicates
		List<String> vehicles = list.stream().distinct().collect(Collectors.toList());
		System.out.println(vehicles);
		
		//count() - counting how many elements you have in a list
		long count =  list.stream().count();
		System.out.println(count);
		//we can also find how many unique elements you have in a list
		long dcount = list.stream().distinct().count();
		System.out.println("distinct elements count are : "+dcount);
		//and we can limit how many elements you want to print by using limit() method
		list.stream().limit(3).forEach(System.out::println);
	}

}

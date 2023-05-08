package com.cg.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapEx {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//map will perform operation on each element in stream and will return single element at a time
		list.stream().map(x-> x+10).forEach(System.out::println);
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
		//when we have to deal with complex collections means we have multiple collections inside a single collection then we use flatMap()
		//flatMap returns a stream of objects at a time
		List<Integer> collect = finalList.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		System.out.println(collect);
		
		//after creating a stream in flatMap we want to perform some other operation then u can use map inside flatMap let see below example
		finalList.stream().flatMap(x->x.stream().map(y->y+10)).forEach(System.out::println);
		
	}

}

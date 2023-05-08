package com.cg.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(82,22,82,99,33,33,42);
		HashSet<Integer> set = new HashSet<>();
		list.stream().filter(n->!set.add(n)).forEach(n->System.out.println(n));
		
		//using Collections.frequency()
		Set<Integer> collect = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(collect);

	}

}

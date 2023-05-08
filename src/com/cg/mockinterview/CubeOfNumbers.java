package com.cg.mockinterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@SuppressWarnings("unused")
public class CubeOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,88,5,6,7,99);
		list.stream().map(x-> x*x*x).filter(x->x>50).forEach(System.out::println);
		list.stream().filter(x->x>50).map(x-> x*x*x).forEach(System.out::println);
		System.out.println("reverse ");
		
		//to reverse we need to collect the list and sort them
		
		List<Integer> collect = list.stream().collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list);
		
		//2nd way
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println();
		//3rd way
		List<Integer> collect2 = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), l-> {Collections.reverse(l); return l;}));
		System.out.println(collect2);
		
	}

}

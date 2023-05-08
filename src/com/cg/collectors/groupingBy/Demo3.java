package com.cg.collectors.groupingBy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		String s = "hello every one how are you";
		
		// count each and every character
		Map<Character, Long> count = s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
		
		// to count first repeated value in a given string
		Map<Character, Long> collect = s.chars().mapToObj(x-> Character.toLowerCase(Character.valueOf((char)x))).collect(Collectors.groupingBy(x->x,LinkedHashMap:: new, Collectors.counting()));
		  Character character = collect.entrySet().stream().filter(x ->(x.getValue()>1L)).map(y->y.getKey()).findFirst().get();
		System.out.println(character);
		
		// to count first non repeated value in given string
		Character c =s.chars().mapToObj(x -> Character.toLowerCase(Character.valueOf((char)x))).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue()==1L).map(x->x.getKey()).findFirst().get();
		System.out.println(c);
	}

}

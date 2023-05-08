package com.cg.streamapi;

import java.util.Set;
import java.util.HashSet;

public class NonRepeatedCharacters {

	public static void main(String[] args) {
		
		String name = "hello all how are you";
		
		
		Set<Character> set = new HashSet<>();
		name.chars().
		mapToObj(x-> (char)x).
		filter(x->set.add(x))
		.forEach(x->System.out.print(x+" "));
		
		
		name.chars().
		mapToObj(i->(char)i).
		filter(i->!set.add(i)).forEach(i-> System.out.print(i +" "));
		
	}

}

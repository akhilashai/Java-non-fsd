package com.cg.functionexamples;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(2));
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		
		System.out.println("length of the string");
		Function<String, Integer> fu = i -> i.length();
		System.out.println(fu.apply("hello world"));
		
		
		
	}

}

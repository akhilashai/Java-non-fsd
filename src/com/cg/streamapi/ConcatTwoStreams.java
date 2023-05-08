package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,22,44,66,77);
		List<String> list1 = Arrays.asList("akhila","haleema");
		Stream.concat(list.stream(), list1.stream()).forEach(System.out::println);
		//Stream<Object> concat = Stream.concat(list.stream(), list1.stream());
		

	}

}

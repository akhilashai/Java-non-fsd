package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class StringsInStreams {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("akhila","haleema","nagoorvali","begum","imran","bhagya sri","bollimuntha srinivasa rao");
		list1.stream().filter(n-> n.length()>5).forEach(System.out::println);
		long count = list1.stream().filter(n-> n.length()>5).count();
		System.out.println("we have "+count+" names whose length greater than 5");
	}

}

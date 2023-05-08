package com.cg.mockinterview;

import java.util.Arrays;
import java.util.List;

public class ToIterateAStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("akhila","haleema","imran");
		list.stream().forEach(System.out::println);
	}

}

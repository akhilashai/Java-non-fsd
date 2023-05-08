package com.cg.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(99,6,5,33,22,11,3,4,2,1);
		Collections.sort(list);
		System.out.println(list);
		
		List<String> str = Arrays.asList("akhila","asif","akbar","haleema","imran","begum","nagoorvali");
		Collections.sort(str);
		System.out.println(str);
	}

}

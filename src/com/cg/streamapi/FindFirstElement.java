package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,222,34,54,67,88);
		//we cannot modify the list bcz we use asList() which gives fixed list 
		//if we r trying to modify it gives unsupportedOperationException
		//list.add(5);
		list.stream().findFirst().ifPresent(n->System.out.println(n));
		

	}

}

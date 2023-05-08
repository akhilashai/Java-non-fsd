package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StartingWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,23,15,19,90);
		//Stream<Integer> data = list.stream();
		list.stream().map(n-> n.toString()).filter(n->n.startsWith("1")).forEach(n->System.out.println(n));
		

	}

}

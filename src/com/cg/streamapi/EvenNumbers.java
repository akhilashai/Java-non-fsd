package com.cg.streamapi;
import java.util.List;
import java.util.Arrays;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,7,8,0,9,3);
		list.stream().filter(n -> n%2==0).forEach(n-> System.out.println(n));

	}

}

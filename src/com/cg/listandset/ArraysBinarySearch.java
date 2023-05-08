package com.cg.listandset;

import java.util.Arrays;
public class ArraysBinarySearch {

	public static void main(String[] args) {
		
		
		String str[] = {"A","Z","I","Y","G"};
		Arrays.sort(str);
		
		int result = Arrays.binarySearch(str, "G");
		System.out.println("index of G : "+result);
		
		
		
		
	}

}

package com.cg.string;

public class MiddleTwo {

	public static void main(String[] args) {
		String name = "akhila";
		int index = name.length()/2;
		System.out.println(index);
		System.out.println(name.substring(index-1,index+1));
		
	}

}

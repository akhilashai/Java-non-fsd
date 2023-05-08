package com.cg.string;

public class LastTwo {

	public static void main(String[] args) {

		String str = "oddly";
		int index = str.length()-2;
		System.out.println(index);
		
		// in string == compares the memory location not value
		System.out.println(str.substring(index,str.length()));
		System.out.println(str.substring(index,str.length())=="ly");
		
		//if u want to compare the value u need to use equal method
		System.out.println(str.substring(index,str.length()).equals("ly"));
		
		
	}

}

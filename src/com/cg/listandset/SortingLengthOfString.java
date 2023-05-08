package com.cg.listandset;
import java.util.TreeSet;

public class SortingLengthOfString {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new SBComparator1());
		set.add("a");
		set.add("zzzz");
		set.add("bbbb");
		set.add("ccccc");
		
		for (String string : set) {
			System.out.println(string);
			
		}
	}

}

package com.cg.listandset;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOfStringBuffering {

	public static void main(String[] args) {
		
		//since jdk 11 stringbuffer and stringBuilder implements comparable so we are not getting any error
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("apq"));

		System.out.println(set);
		
		for (StringBuffer stringBuffer : set) {
			System.out.println(stringBuffer);
		}
		
	}

}

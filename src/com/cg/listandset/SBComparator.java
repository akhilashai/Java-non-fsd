package com.cg.listandset;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();
		return compare(o1, o2);
	}

}

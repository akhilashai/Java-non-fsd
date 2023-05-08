package com.cg.listandset;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);
		
	}

}

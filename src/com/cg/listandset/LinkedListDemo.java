package com.cg.listandset;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Object object[] = new Object[1000000];
		
		for(int i=0; i<object.length; i++)
		{
			object[i]=new Object();
		}
		long start=System.currentTimeMillis();
		
		List<Object> list = new LinkedList<Object>();
		for (Object objects : object) {
			list.add(objects);
			
		}
		long end = System.currentTimeMillis();
		long total = (end-start);
		System.out.println("total time in milli secs : "+total);
		
	}

}

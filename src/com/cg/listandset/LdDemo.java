package com.cg.listandset;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class LdDemo {
	
	public static void main(String args[])
	{
		List<String> list = new LinkedList<String>();
		list.add("akhila");
		list.add("shaik");
		
		ListIterator<String> lit = list.listIterator();
		System.out.println(" traversing in forward direction");
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println(" travering in backward direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}

}

package com.cg.listandset;

import java.util.List;
import java.util.ArrayList;

public class ArrayListMoreMethods {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i =10; i<=100; i+=10)
		{
			list.add(i);
		}
		 System.out.println("list : "+list);
		 
		 List<Integer> secondList = new ArrayList<Integer>();
		 secondList.add(111);
		 secondList.add(222);
		 secondList.add(333);
		 
		 System.out.println("second list : "+secondList);
		 
		 //to add 2nd list to the 1st list at a particular index
		 System.out.println("to add 2nd list to the 1st list at a particular index");
		 list.addAll(2, secondList);
		 System.out.println(list);
		 
		 //to add 2nd list at the end of existing list
		 System.out.println("to add 2nd list at the end of existing list");
		 list.addAll(secondList);
		 System.out.println(list);
		 
		 //to search an element in the existing list
		if( list.contains(220))
		{
			System.out.println("value is present in the list");
		}
		else
		{
			System.out.println("value is not present in the list");
		}
		//here we are using size and get methods
		
		System.out.println("elements in the list");
		for(int i=0; i<list.size(); i++)
		{
			
			System.out.println(list.get(i));
			
		}
		
		//to remove the element
		System.out.println("we removing the element ");
		System.out.println(list.remove(3));
		System.out.println("after removing the element");
		System.out.println(list);
		
		 
		
	}

}

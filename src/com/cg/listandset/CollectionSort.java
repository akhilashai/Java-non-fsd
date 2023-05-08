package com.cg.listandset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	
	public static void main(String args[])
	{
		List<Character> list = new ArrayList<>();
		list.add('c');
		list.add('m');
		list.add('a');
		list.add('n');
		
		System.out.println("Before Sorting :"+list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting : "+list);
		
		Collections.reverse(list);
		
		System.out.println("Reversing the list : "+list);
	}

}

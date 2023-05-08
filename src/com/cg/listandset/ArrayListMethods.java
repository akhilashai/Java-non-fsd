package com.cg.listandset;
import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=10; i<=100; i +=10)
		{
			list.add(i);
		}
		System.out.println("list : "+list);
		
		//if we want to add the element at a particular index
		
		list .add(2,100);
		
		System.out.println("list after adding element : "+list);
		
		//if we want to replace the element then
		
		list.set(3, 400);
		
		System.out.println("After replacing : "+list);
	}

}

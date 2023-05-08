 package com.cg.listandset;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add(new Integer(20));
		list.add(10);//because of autoboxing we can add primitives to the collections this can be possible only after java 1.5 version
		list.add(2.567);
		list.add("akhila");
		System.out.println(list);
		
		//we cannot add like above bcz it causes runtime error to fetch the data 
		//so we need to give generics like below
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(20);
		list1.add(30);
		//like this we need to add
	}

}

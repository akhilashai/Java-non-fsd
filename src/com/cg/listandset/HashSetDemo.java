package com.cg.listandset;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String args[])
	{
		Random obj = new Random();
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<=10;i++)
		{
			int num = obj.nextInt(5);
			list.add(num);
		}
		System.out.println("list : "+list);
		
		Set<Integer> set = new HashSet();
		
		for(int i=0;i<=10;i++)
		{
			int num = obj.nextInt(5);
			set.add(num);
		}
		System.out.println("set : "+set);
		
		
	}

}

package com.cg.listandset;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random obj = new Random();
		
		//doesn't allow duplicates
		//doesn't follow insertion and ascending order
		//Set<Integer> set = new HashSet<Integer>();
		
		
		//doesn't allow duplicates and follow insertion order
		//Set<Integer> set = new LinkedHashSet<Integer>();
		
		
		//follows ascending order
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<=10;i++)
		{
			int num = obj.nextInt(7);
			set.add(num);
			System.out.println(num);
		}

		System.out.println("set : "+set);
		System.out.println(obj.nextInt(100));
	}

}

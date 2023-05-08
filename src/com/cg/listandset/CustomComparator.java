package com.cg.listandset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class CustomComparator implements Comparator<Character> {

	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<>();
		list.add('c');
		list.add('m');
		list.add('a');
		list.add('n');
		
		System.out.println("Before Sorting :"+list);
		
		Collections.sort(list, new CustomComparator());
		
		System.out.println("After Sorting : "+list);
		
		int result = Collections.binarySearch(list, 'm');
		
		System.out.println("returns index of element "+result);
		//if the value is not present in the list then it gives negative value
		
		
	}

	@Override
	public int compare(Character o1, Character o2) {
		if(o1<02)
		{
			return -1;
		}
		else if(o1>o2)
		{
			return 1;
		}
		else {
		return o1.compareTo(o2);
		}
	}

}

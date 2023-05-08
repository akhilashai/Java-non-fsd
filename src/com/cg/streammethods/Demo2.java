package com.cg.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3,6,90,87,65,45,92,98);
		List<String> list1 = Arrays.asList("A","B","C","1","2","3");
		
		//min() method
		Optional<Integer> min = list.stream().min((val1,val2)-> val1.compareTo(val2));
		System.out.println(min.get());
		
		//max() method
		Optional<Integer> max = list.stream().max((val1,val2)-> val1.compareTo(val2));
		System.out.println(max.get());
		
		//reduce() - this method combines individual objects and return in a single stream
		Optional<Integer> red = list.stream().reduce((value,combinedValue)-> { return combinedValue + value;});
		System.out.println(red.get());
		Optional<String> redu = list1.stream().reduce((value,combinedValue)-> { return combinedValue + value;});
		System.out.println(redu.get());
		
		//toArray() - this method is used toj convert collection to array and toarray method returns object array
		Object[] arr = list1.stream().toArray();
		for(Object s : arr)
		{
			System.out.println(s);
		}
	}

}

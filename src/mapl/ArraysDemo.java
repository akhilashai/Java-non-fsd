package mapl;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo implements Comparator<Character> {
	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	public static void main(String[] args) {
		
		int a[] = {10,40,25,90,99,32,06,21};
		
		System.out.println("Before sorting");
		for(Integer i : a)
		{
			System.out.println(i);
		}
		Arrays.sort(a);
		
		System.out.println("After sorting");
		for(Integer i : a)
		{
			System.out.println(i);
		}
		
		char b[] = {'a','i','u','o','e'};
		//Arrays.sort(b, new ArraysDemo());
		
		Arrays.sort(b);
		for(Character c : b)
		{
			System.out.println(c);
		}

		
		
	}

	

}

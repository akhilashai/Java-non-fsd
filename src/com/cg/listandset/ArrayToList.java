package com.cg.listandset;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		
		String a[] = {"akhila","nagurvali","imran","haleema","begum"};
		
		List<String> list = Arrays.asList(a);
		//if we change the array it will reflect to the list and we can't modify the list bcz array has fixed size
		a[1]="nagoorvali";
		System.out.println(list);
	}

}

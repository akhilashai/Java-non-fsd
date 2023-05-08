package com.cg.predicateexamples;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		//exe 1
		Predicate<Integer> p = x -> (x>4);
		System.out.println(p.test(5));
		System.out.println(p.test(0));
		
		//exe 2
		Predicate<String> pr = s -> s.length()>6;
		System.out.println(pr.test("hello world"));
		
		//exe 3 invoke the above predicate expression inside the loop
		String names[] = {"akhila","haleema","imran","vali","nagoor","begum"};
		for(String name:names)
		{
			if(pr.test(name))//here we calls exe 2 predicate method
			{
				System.out.println(name);
			}
		}

	}

}

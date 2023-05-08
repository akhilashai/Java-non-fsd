package com.cg.predicateexamples;

import java.util.function.Predicate;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// joining predicates using and, or and negate operators
		
		int[] a = {1,2,3,4,5,6,9,8,7,0};
		Predicate<Integer> p = i -> (i>4);
		Predicate<Integer> pr = i -> (i%2 ==0);
		
		for(int d : a)
		{
			/*if(p.test(d)&& pr.test(d))
			{
				System.out.println(d);
			}*/
			//we can do above condition using and operator
			//System.out.println("using and operator");
			if(p.and(pr).test(d))
				
			{
				System.out.println(d);
			}
			//System.out.println("using or operator");
			if(p.or(pr).test(d))
				
			{
				System.out.println(d);
			}
			//System.out.println("using negate operator");
			if(p.negate().test(d))
				
			{
				System.out.println(d);
			}
		}

	}

}

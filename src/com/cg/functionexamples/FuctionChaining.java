package com.cg.functionexamples;

import java.util.function.Function;

/*
 * 
 * Fuction Chaining
   --------
 * andThen() do you want to know how it works then read below class comment lines
 * compose()
 * identity() is a static class
 */



public class FuctionChaining {
	
	public static void main(String[] args)
	{
		Function<Integer, Integer> f = i -> i*2;
		Function<Integer, Integer> fr = i-> i*i*i;
		// first apply() method applies to f and f LE will execute and the value goes to fr and fr LE works with that value
		System.out.println(f.andThen(fr).apply(3));// 6  216
		// first apply() method applies to fr and fr LE will execute and the value goes to f and f LE works with that value
		System.out.println(f.compose(fr).apply(3));// 27 54
		
		//it will return what u give for example
		//it's a static method that's why we are calling with class name
		Function<String, String> fu = Function.identity();
		System.out.println(fu.apply("akhila"));    // output : akhila
	}
	

}

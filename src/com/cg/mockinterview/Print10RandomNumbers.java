package com.cg.mockinterview;

import java.util.Random;

public class Print10RandomNumbers {
	
	/*
	 * to print 10 random numbers using for each
	 * 
	 * to do this we have to generate random numbers by using math.random()
	 * 
	 * math.random() always returns double value
	 */

	public static void main(String[] args) {
	
		
		Random random = new Random();
		
		random.ints().limit(10).forEach(System.out::println);
		
	}

}

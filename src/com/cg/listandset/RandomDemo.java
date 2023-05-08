package com.cg.listandset;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		Random obj = new Random();
		
		//it generates random value
		int x =obj.nextInt();
		System.out.println("x : "+x);
		//it generates random value with in the range you given in the open brackets of methods nextInt()..
		int y = obj.nextInt(100);
		System.out.println("y : "+y);
		
	}

}

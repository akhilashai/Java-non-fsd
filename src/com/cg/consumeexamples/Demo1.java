package com.cg.consumeexamples;

//import java.util.Arrays;
//import java.util.List;
import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(2,3,54,76,51,99);
		Consumer<Integer> c = n -> System.out.println(n);
		c.accept(6);
		c.accept(21);
		c.accept(36);
		c.accept(61);
		
	}

}

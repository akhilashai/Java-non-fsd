package com.cg.codinginterviewquestions;

public class ThreadExample1 implements Runnable {
	
	public void run()
	{
		System.out.println("thread is begining");
	}

	public static void main(String[] args) {
		
		Runnable r = new ThreadExample1();
		Thread t = new Thread(r);
		t.start();
	}

}

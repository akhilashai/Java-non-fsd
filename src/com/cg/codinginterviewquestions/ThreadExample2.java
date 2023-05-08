package com.cg.codinginterviewquestions;

class A extends Thread{
	public void run()
	{
		System.out.println("running A");
	}
}

public class ThreadExample2 extends Thread {

	public void run()
	{
		System.out.println("running ex");
	}
	public static void main(String[] args) {
		A a = new A();
		ThreadExample2  t = new ThreadExample2();
		System.out.println(a.getName());
		System.out.println(t.getName());
		System.out.println(a.getId());
		System.out.println(t.getId());
		a.start();
		t.start();
	}

}

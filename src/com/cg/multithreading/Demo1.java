package com.cg.multithreading;

public class Demo1 extends Thread {
	
	public void run() {
		//creating new thread name
		Thread t = new Thread(this , "main thread");
		System.out.println(t);
		//displaying current thread
		System.out.println(Thread.currentThread());
		for(int i=0; i<=10; i++)
		{
			//System.out.println(Thread.currentThread());
			System.out.println("inside thread value is "+i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
	Demo1 d = new Demo1();
	d.start();
	d.setName("akhila");
	d.join();
	if(d.isDaemon())
	{
		System.out.println("It is Daemon Thread");
	}
	else
	{
		System.out.println("It is not a Daemon Thread");
	}
	for(int i=1; i<=10; i++)
	{
		System.out.println("outside thread value is "+i);
	}
		
	}

}

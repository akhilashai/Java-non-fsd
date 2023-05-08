package com.cg.codinginterviewquestions;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadEx implements Runnable{
	int i;
	
	public ThreadEx(int i)
	{
		this.i =i;
	}

	@Override
	public void run() {
		
		System.out.println(i+" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadPoolForSingleTask {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService es = Executors.newFixedThreadPool(15);
		System.out.println(new Date());
		for(int i=1;i<=25;i++)
		{
			es.execute(new ThreadEx(i));
		}
		
		//es.shutdown();//doesn't wait for the complete execution
		es.awaitTermination(10, TimeUnit.SECONDS); //waits until execution is completed
		System.out.println(new Date());
			
	}

}

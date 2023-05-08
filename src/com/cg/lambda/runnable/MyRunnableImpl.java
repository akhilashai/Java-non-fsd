package com.cg.lambda.runnable;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}

}

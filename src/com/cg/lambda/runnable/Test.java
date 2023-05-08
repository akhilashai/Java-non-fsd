package com.cg.lambda.runnable;

public class Test {

	public static void main(String[] args) {
		//Runnable r = new MyRunnableImpl();
		//Thread t = new Thread(r);
		//t.start();
		
		//we don't require above lines and myrunnableimpl class if we are using lambda expression
		 Runnable r = ()->{
			 for(int i=0;i<=10;i++)
			 {
				 System.out.println("child thread");
			 }
		 };
		 r.run();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}

}

package com.cg.codinginterviewquestions;

public class SumUsingMultiThread extends Thread{
	
	public void run()
	{
		int[] a = {1,4,55,67,88,92};
		int sum =0;
		for(Integer i: a)
		{
		 sum  += i;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		SumUsingMultiThread mt = new SumUsingMultiThread();
		mt.start();
		
	}

}

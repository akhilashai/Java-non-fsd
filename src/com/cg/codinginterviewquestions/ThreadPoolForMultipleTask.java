package com.cg.codinginterviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class First implements Callable<Integer>{
	
	int input;
	
	public First(int input)
	{
		this.input = input;
		
	}
	@Override
	public Integer call() throws Exception {
		int sum =0;
		for(int i=1;i<=input;i++)
		{
			sum+=i;
			
		}
		return sum;
	}
	
}

public class ThreadPoolForMultipleTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		List<Callable<Integer>> list = new ArrayList<>();
		list.add(new First(4));
		list.add(new First(2));
		List<Future<Integer>> invokeAll = es.invokeAll(list);
		es.awaitTermination(10, TimeUnit.SECONDS);
		for(Future<Integer> f : invokeAll)
		{
			System.out.println(f.get());
		}
		
	}

}

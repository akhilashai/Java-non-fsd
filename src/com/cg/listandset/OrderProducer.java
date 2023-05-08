package com.cg.listandset;
import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {
	
	BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue)
	{
		this.queue= queue;
	}

	@Override
	public void run() {
			
		
		queue.add("hello world");
		queue.add("hello india");
		queue.add("hello andhra");
		
	}

}

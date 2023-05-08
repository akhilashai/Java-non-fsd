package com.cg.listandset;
import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {
	
BlockingQueue<String> queue;
	
	public OrderConsumer(BlockingQueue<String> queue)
	{
		this.queue= queue;
	}

	@Override
	public void run() {
			
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

}

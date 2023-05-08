package com.cg.listandset;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultipleThreads extends Thread{
	
	static CopyOnWriteArrayList<String> course = new CopyOnWriteArrayList<String>();

	@Override
	public void run()
	{
		course.add("java");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MultipleThreads multi = new MultipleThreads();
		multi.start();
		
		course.add("python");
		course.add("c");
		course.add("c++");
		
		Iterator<String> it =course.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(course);
		
		
		
	}

}

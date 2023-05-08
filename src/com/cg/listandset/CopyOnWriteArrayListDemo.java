package com.cg.listandset;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> course = new CopyOnWriteArrayList<>();
		course.add("mpc");
		course.add("bipc");
		course.add("cec");
		course.add("mec");
		//if we are removing element while using iterator in arraylist it gives an exception called concurrent modification exception
		//when we have lots of reading operation few adding and deletion operation then we use copyonwritearraylist 
		Iterator<String> it =course.iterator();
		while(it.hasNext())
		{
			String courses = it.next();
			System.out.println(courses);
			if(courses.equals("mec"))
			{
				course.remove(courses);
			}
			
		}
		System.out.println(course);
		
	}

}

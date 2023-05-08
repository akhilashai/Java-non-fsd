package mapl;

import java.util.ArrayList;

public class WildCardEntry {
	
	public static void main(String args[])
	{
		WildCardEntry wce = new WildCardEntry();
		
		//we can pass the thread class but we cannot add the values now also
		wce.myMethod(new ArrayList<A>());
	}
	
	//there is one way to pass the object by using super class
	
	public void myMethod(ArrayList<? /*extends Thread*/ super B> l)
	{
		//this ? mark is called wild card it only allows null value 
		l.add(null);
		//if you wanna try to add other values it gives error 
		//l.add("akhila");
		//the above one gives error if u wanna see then remove the comment
		
		l.add(new B());
	}
	
	//we also define the generic at method level
	//remember that the generic type should be define before return type
	
	public <T extends Thread&Comparable> void urMethod()
	{
		
	}

}

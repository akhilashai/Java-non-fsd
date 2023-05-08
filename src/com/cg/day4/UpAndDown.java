package com.cg.day4;

class A
{
	public  void show()
	{
		System.out.println("in A");
	}
}
class B extends A{
	public void show()
	{
		System.out.println("in B");
	}
	
	public void show1()
	{
	System.out.println("in B show 1");
	}
}

public class UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//up casting
		A a = new B();
		a.show();
		
		B b = (B)a;
		b.show1();

	}

}

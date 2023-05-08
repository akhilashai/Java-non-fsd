package com.cg.depricated;

public class A {
	//meaning of this annotation is we should not use this variable if we apply it in class level and method level also we get warnings that this class and method is depricated
	@Deprecated
	int a;
	@Deprecated
	int b=10;
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	@Deprecated
	public void method1()
	{
		
	}
	
	

}

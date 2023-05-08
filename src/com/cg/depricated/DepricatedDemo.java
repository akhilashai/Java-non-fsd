package com.cg.depricated;

import java.util.ArrayList;
import java.util.List;

public class DepricatedDemo {

	@SuppressWarnings( {"deprecation","rawtypes"})
	public static void main(String[] args) {
		
		A a = new A();
		a.setA(44);
		System.out.println(a.getA());
		
		//using deprecated method it gives warning to supress this warning we need to give @supressWarnings annotations
		a.method1();
		System.out.println(a.b);
		
		//we know that if we don't give the type of value in the list it gives a warning we can over come by using this @supressWarnings annotations
		List list = new ArrayList();
		System.out.println(list);
		
	}

}

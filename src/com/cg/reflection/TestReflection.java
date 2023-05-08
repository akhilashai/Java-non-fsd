package com.cg.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class TestReflection {

	public static void main(String[] args) {
		try {
			//we successfully loaded the class into the memory
		Class<?> myClass = Class.forName(Calculator.class.getName());
		System.out.println(myClass.getName());
		
		Constructor<?>[] constructors = myClass.getConstructors();
		System.out.println(Arrays.toString(constructors));
		
		System.out.println(Arrays.toString(myClass.getMethods()));
		
		Constructor<?> constructor = myClass.getConstructor(null);
		System.out.println(constructor.newInstance(null));
		
		Constructor<?> constructor1 = myClass.getConstructor(double.class, double.class);
		Object obj = constructor1.newInstance(5,10);
		
		Method setMethod1 = myClass.getMethod("setNum1", double.class);
		System.out.println(setMethod1.invoke(obj, 10));
		
		Field newField1 = myClass.getDeclaredField("num1");
		newField1.setAccessible(true);
		
		newField1.set(obj,88);
		
		Method getMethod1 = myClass.getMethod("getNum1", null);
		System.out.println(getMethod1.invoke(obj, null));
		
		
		
		Method method1 = myClass.getMethod("sum", int.class,int.class);
		System.out.println(method1.invoke(obj, 10,20));
		
		Annotation[] annotations = myClass.getAnnotations();
		System.out.println(Arrays.toString(annotations));
		
		MyAnnotation annotation = (MyAnnotation)annotations[0];
		System.out.println(annotation.value1());
		System.out.println(annotation.value2());
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

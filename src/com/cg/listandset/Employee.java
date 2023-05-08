package com.cg.listandset;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	int id;
	String name;
	
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int compare(Employee o1, Employee o2)
	{
		String s1 = o1.name;
		String s2 = o2.name;
		return s1.compareTo(s2);
	}
	
}

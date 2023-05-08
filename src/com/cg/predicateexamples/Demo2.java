package com.cg.predicateexamples;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	String name;
	double salary;
	int experience;
	
	Employee(String name, double salary, int experience){
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	
}



public class Demo2 {

	public static void main(String[] args) {
		
		//ex1:
		Employee e = new Employee("akhila",400000,4);
		Predicate<Employee> pr = x -> (x.salary>50000 && x.experience >2);
		System.out.println(pr.test(e));
		
		//Ex2:
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("akhila",400000,4));
		list.add(new Employee("madhu",20000,5));
		list.add(new Employee("bindu",70000,3));
		list.add(new Employee("kavya",45000,7));
		
		for(Employee emp : list)
		{
			if(pr.test(emp))
			{
				System.out.println(emp.name);
			}
		}
		
		
		
	}

}

package com.cg.consumeexamples;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	
	String ename;
	String gender;
	double salary;
	
	Employee(String ename, String gender, double salary)
	{
		this.ename = ename;
		this.gender = gender;
		this.salary = salary;
	}
}


public class Demo2 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("akhila","female",20000));
		list.add(new Employee("saiba","female",25000));
		list.add(new Employee("angad","male",15000));
		list.add(new Employee("sirat","female",10000));
		
		Function<Employee, Double> f = i -> ((i.salary * 10)/100);
		Predicate<Double> p = b -> b>1000;
		Consumer<Employee> c = i -> {
							System.out.println(i.ename);
							System.out.println(i.gender);
							System.out.println(i.salary);
		};
		//System.out.println("hello world");
		
		
		for(Employee emp : list)
		{
			//c.accept(emp);
			double bonus = f.apply(emp);
			//System.out.println(bonus);
			if(p.test(bonus))
			{
				c.accept(emp);
				System.out.println(bonus);
			}
		}
		
		
	}

}

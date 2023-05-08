package com.cg.functionexamples;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class Employee{
	
	String ename;
	double salary;
	Employee(String ename, double salary)
	{
		this.ename = ename;
		this.salary = salary;
	}
	
}


public class Demo2 {

	public static void main(String[] args) {
		

		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("akhila", 40000));
		list.add(new Employee("haleema", 50000));
		list.add(new Employee("imran", 20000));
		list.add(new Employee("nagoor", 60000));
		list.add(new Employee("begum", 100000));
		
		Function<Employee, Double> f = e->{
										double sal = e.salary;
										if(sal> 20000 && sal<= 30000)
											return (sal * 10/100);
										if(sal> 30000 && sal<= 40000)
											return (sal * 20/100);
										if(sal> 40000 && sal<= 50000)
											return (sal * 30/100);
										else
											return(sal * 40/100);
			
		};
		Predicate<Double> p = b-> b>20000;
		
		
		for(Employee emp : list)
		{
			
			double bonus = f.apply(emp);
			if(bonus>50000)
			{
				System.out.println(emp.ename +"  "+emp.salary);
				//System.out.println();
				System.out.println("bonus " +(bonus));
				System.out.println();
			}
			//using predicate intergace
			if(p.test(bonus))
			{
				System.out.println(emp.ename +"  "+emp.salary);
				//System.out.println();
				System.out.println("bonus " +(bonus));
				System.out.println();
			}
			
		}
		
	}

}

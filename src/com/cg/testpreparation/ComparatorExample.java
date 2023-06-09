package com.cg.testpreparation;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class ComparatorExample implements Comparator<Student>
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, new ComparatorExample());
       
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		double s1 = o1.getCgpa();
		double s2 = o2.getCgpa();
		
		if(s1<s2)
		{
			return 1;
		}
		if(s1==s2)
		{
			if(o1.getFname().equals(o2.getFname()))
			{
				if(o1.getId()>o2.getId())
				{
					return -1;
				}
				if(o1.getId()==o2.getId())
				{
					return 0;
				}
				if(o1.getId()<o2.getId())
				{
					return 1;
				}
			}
			//return o1.getId().compareTo(o2.getId());
			else 
				return o1.getFname().compareTo(o2.getFname());

		}
		if(s1>s2)
		{
			return -1;
		}
		return 0;
	}
}




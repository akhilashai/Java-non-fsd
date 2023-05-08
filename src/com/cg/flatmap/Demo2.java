package com.cg.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

class Student{
	
	String name;
	int rollNo;
	String gender;
	
	Student(String name, int rollNo, String gender)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.gender = gender;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		
		List<Student> class1 = new ArrayList<>();
		class1.add(new Student("akhila",101,"female"));
		class1.add(new Student("haleema",102,"female"));
		class1.add(new Student("shaik",103,"male"));
		
		List<Student> class2 = new ArrayList<>();
		class2.add(new Student("nagoorvali",201,"male"));
		class2.add(new Student("begum",202,"female"));
		class2.add(new Student("imran",203,"male"));
		
		List<List<Student>> school = Arrays.asList(class1, class2);
		
		List<String> collect = school.stream().flatMap(x-> x.stream().map(y-> y.name)).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}

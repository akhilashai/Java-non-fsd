package com.cg.day3;

public class Main {
	public static void main(String args[])
	{
		Person p = new Person();
		p.setName("Imran");
		p.setAge(20);
		System.out.println(p.getName()+"  "+ p.getAge());
		
		Person p1 = new Person("akhila",20);
		System.out.println(p1.getName()+"  "+ p1.getAge());
		
		Dog d = new Dog();
		d.speak();
	
		
	}
	

}

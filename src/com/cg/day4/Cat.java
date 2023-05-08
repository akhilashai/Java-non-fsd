package com.cg.day4;



public class Cat implements Animal {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("meow......");
		
	}

}

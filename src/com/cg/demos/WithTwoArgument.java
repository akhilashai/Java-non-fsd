package com.cg.demos;

interface Ola{
	public void booking(String Origin, String destination);
}


public class WithTwoArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ola o = (Origin, destination)-> System.out.println("cab is booked from "+Origin+" to "+destination);
		o.booking("Hyd", "Tenali");
	}

}

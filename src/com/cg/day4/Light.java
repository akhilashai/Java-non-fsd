package com.cg.day4;

import java.util.Scanner;

public class Light {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		Traffic status = Traffic.green;
		switch(status)
		{
		case green:
			System.out.println("you are reday to go");
			break;
		case red:
			System.out.println("stop!");
			break;
		case orange:
			System.out.println("Ready to go");
			break;
		}
		
		
	}

}

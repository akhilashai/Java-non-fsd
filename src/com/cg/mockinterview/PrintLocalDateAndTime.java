package com.cg.mockinterview;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PrintLocalDateAndTime {

	public static void main(String[] args) {
		
		System.out.println("current date :"+ LocalTime.now());
		System.out.println("current time : "+ LocalDate.now());
		System.out.println("current date and time : "+LocalDateTime.now());
		
		
		
	}

}

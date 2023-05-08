package com.cg.numberformat;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Date;

public class DateHandsOn {

	public static void main(String[] args) {
		
		Date d = new Date();
		DateFormat dateInstance = DateFormat.getDateInstance(0,Locale.US);
		DateFormat dateInstance2 = DateFormat.getDateInstance(0,Locale.UK);
		System.out.println(dateInstance.format(d));
		System.out.println(dateInstance2.format(d));
		
		DateFormat timeInstance = DateFormat.getTimeInstance(0, Locale.ITALIAN);
		
		System.out.println(timeInstance.format(d));
		
		DateFormat timeInstance2 = DateFormat.getTimeInstance();
		System.out.println(timeInstance2.format(d));
		
		DateFormat timeInstance3 = DateFormat.getDateTimeInstance(0,0);
		System.out.println(timeInstance3.format(d));
		
		LocalDate.of(2, 4, 12).getDayOfWeek().toString();
	}

}

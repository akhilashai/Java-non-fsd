package com.cg.numberformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date =sdf.format(new Date());
		System.out.println(date);
		
		String dateOfString ="28/09/2002";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sdf.parse(dateOfString);
		System.out.println(date1);
	}

}

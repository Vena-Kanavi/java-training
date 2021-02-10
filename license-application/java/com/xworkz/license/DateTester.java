package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTester {
	public static void main(String[] args) throws ParseException {
		String dateString = "20200301";

//		LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.BASIC_ISO_DATE);
//
//		System.out.println(date);

		Date date=new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		String stringDate = format.format(date);
		System.out.println(stringDate);

		// System.out.println(date2);

		SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");

		Date date2 = format2.parse("16-03-1996");

		System.out.println(date2);

	}

}

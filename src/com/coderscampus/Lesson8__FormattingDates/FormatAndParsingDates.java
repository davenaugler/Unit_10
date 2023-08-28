// The old way of using Dates in Java

package com.coderscampus.Lesson8__FormattingDates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatAndParsingDates {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// .set(int year, int month, int date, int hourOfDay, int minute, int second)
		// Month is zero based
//		cal.set(2023, 8, 15, 13, 23, 0);
		cal.set(2023, 8, 15);
		Date sept2023 = cal.getTime();
		System.out.println(sept2023); // Fri Sep 15 13:23:00 MDT 2023
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMMM-dd h:m:s a - zzzz"); // 2023-September-15 4:3:19 PM - Mountain Daylight Time
//		DateFormat dateFormat = new SimpleDateFormat("EEEE MMMM dd, yyyy"); // Friday September 15, 2023
//		DateFormat dateFormat = new SimpleDateFormat("E MMMM d, y");
		String formattedDate = dateFormat.format(sept2023);
		System.out.println(formattedDate); // Friday September 15, 2023
		
		
		// [ We're taking a STRING as input and we are converting it to a date OBJECT ]
		System.out.println("");
		String dateValue1 = "2020-01-05 5:00 PM"; // String 1
		String dateValue2 = "2019-01-05 10:00 AM"; // String 2
		
		// To compare the date strings above we need to format the dates first
		
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd h:mm a");
		Date date1; // Object 1
		Date date2; // Object 2
		try {
			date1 = dateFormat2.parse(dateValue1);
			date2 = dateFormat2.parse(dateValue2);
			if (date1.before(date2)) {
				System.out.println(date1 + " COMES BEFORE " + date2);
			} else {
				System.out.println(date1 + " DOES NOT COME BEFORE " + date2);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

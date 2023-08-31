// The old way of using Dates in Java
package com.coderscampus.D_Lesson7__ModifyingDates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ModJavaUtilDatesApplication {

	public static void main(String[] args) {
		
							// Year, month, date, hrs, min, sec
							// Month is zero based, everything thing else isn't
							// Year starts at 1900 when you put in "0"
							// So if you want year 2023 you need to subtract 2023 - 1900 = 123
							// Put 123 in for the year to get the output of 2023
		// This is deprecated, don't use this approach, use Calendar instead
		Date jan012020 = new Date(123, 7, 24, 12, 14, 30);
		System.out.println(jan012020); // Outputs "Fri Aug 24 12:14:30 MDT 3923" | This happens when you enter "2023" for the year instead of 123
		
//		Calendar cal = new Calendar(); // You can't instantiate type Calendar, you have to create a static instance like on line 19
		Calendar cal = Calendar.getInstance(); 
		Date now = cal.getTime();
		System.out.println("Current time is: " + now); // Output: "Thu Aug 24 12:23:51 MDT 2023" (exact date and time when it runs)
		
		Date nextDate = cal.getTime();
		// void java.util.Calendar.set(int year, int month, int date, int hourOfDay, int minute, int second)
		// month is zero based
		cal.set(2023, 7, 25, 12, 0, 0);
		nextDate = cal.getTime();
		System.out.println("nextDate: " + nextDate);
		
		//  Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules. 
		//  For example, to subtract 5 days from the current time of the calendar, you can achieve it by calling:
		//  add(Calendar.DAY_OF_MONTH, -5).
		
		// Add -5 hours to day of the month
		cal.add(Calendar.DAY_OF_MONTH, -5);
		System.out.println("minus 5 days: " + cal.getTime());
		
		// Add 2 hours to time
		cal.add(Calendar.HOUR, 2);
		System.out.println("plus 2 hours" + cal.getTime());
		
		// Add -5 minutes to the minutes 
		cal.add(Calendar.MINUTE, -5);
		System.out.println(cal.getTime());
		
		
		// Compare two dates
		Date newNow = new Date();
		if (newNow.after(cal.getTime())) {
			// "newNow" is getting the present date and time.
			// "cal.getTime()" is getting the date and time from line 45
			System.out.println(newNow + " IS AFTER " + cal.getTime());
		} else {
			System.out.println(newNow + " IS NOT AFTER " + cal.getTime());
		}
		
		
		// Conversion of Time Zone: Now works
		System.out.println("");
		System.out.println("---- CHANGING THE TIME ZONE ----");
		Calendar newCal = Calendar.getInstance();
		newCal.set(2023, 7, 25);
		Date aug2023 = newCal.getTime();
		System.out.println(aug2023); // Fri Aug 25 16:15:41 MDT 2023
		
		DateFormat formatter = new SimpleDateFormat("E MMM d h:m:s a z yyyy");
		formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String formattedDate = formatter.format(aug2023);
		System.out.println(formattedDate);
				

		
		
		
//		Chat GPT: Time Zone Conversion Does not work. Dindn't give much time here.
//		Calendar calendar = Calendar.getInstance();
//		System.out.println("Default Time Zone: " + calendar.getTime());
//		
//		TimeZone newYorkTimeZone = TimeZone.getTimeZone("America/New_York");
//		calendar.setTimeZone(newYorkTimeZone);
//		System.out.println("New York Time Zone: " + calendar.getTime());
		
		
		
		
		
		
		

		
		
		
		
	}

}

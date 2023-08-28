// The new way of using Dates in Java
package com.coderscampus.Lesson9__Java8Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDatesApplication {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println(date + " " + time); // 2023-08-28 12:11:41.379976
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE)); // 2023-08-28
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2023-08-28T12:11:41.379998
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2023-08-28
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"))); // 08-28-2023
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy HH:mm:ss a"))); // Monday August 28, 2023 12:11:41 PM
		System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy HH:mm:ss a - z"))); // Monday August 28, 2023 12:11:41 PM - MDT
		System.out.println(zonedDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME)); // Mon, 28 Aug 2023 12:14:20 -0600
		System.out.println(zonedDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME) + zonedDateTime.format(DateTimeFormatter.ofPattern(" (z)"))); // Mon, 28 Aug 2023 12:24:20 -0600 (MDT)

	}

}

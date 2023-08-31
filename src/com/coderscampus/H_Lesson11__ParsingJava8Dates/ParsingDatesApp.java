package com.coderscampus.H_Lesson11__ParsingJava8Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;

public class ParsingDatesApp {

	public static void main(String[] args) {
		
		try {
			LocalDateTime aug1 = LocalDateTime.parse("2023-08-28 9:23 PM", DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a"));
			System.out.println(aug1.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy h:mm a")));
		} catch (DateTimeParseException e) {
			System.out.println("Oops, it doesn't look like your Date/Time is formatted correctly");
		}
		
		LocalDate endOfAug = LocalDate.of(2023, 8, 28).with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(endOfAug.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy")));

	}

}

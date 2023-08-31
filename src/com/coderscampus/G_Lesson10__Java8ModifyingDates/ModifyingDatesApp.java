package com.coderscampus.G_Lesson10__Java8ModifyingDates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModifyingDatesApp {

	public static void main(String[] args) {
		
		String user = "Dave";
		// Remember that everyone does not live in YOUR TIME ZONE.
		// Need to account for other Time Zones so that time is not lost
		// when it comes to time sensitive actions being performed.
		
		// .of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
		// NO ZERO BASED INDEXING FOR MONTH
		LocalDateTime startTime = LocalDateTime.of(2023, 8, 28, 16, 0, 0, 0);
		System.out.println("Start Time: " + startTime.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy h:mm:ss a")));
		
		LocalDateTime presentTime = LocalDateTime.now();
		System.out.println("Present Time: " + presentTime.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy h:mm:ss a")));
		
		System.out.println("");
		
		compareStartTimeToPresentTime(user, startTime, presentTime);
		compareStartTimeToPresentTime(user, startTime.plusDays(1), presentTime);
		compareStartTimeToPresentTime(user, startTime.plusDays(10), presentTime);
	}

	private static void compareStartTimeToPresentTime(String user, LocalDateTime startTime, LocalDateTime presentTime) {
		if (startTime.isBefore(presentTime)) {
			System.out.println("Start Time is BEFORE Present Time. Nice work " + user + "!");
		} else if (startTime.isAfter(presentTime)) {
			System.out.println("Start Time is AFTER Present Time. This is not good " + user + "!");
		} else {
			System.out.println("Bro...something's wrong with the time! Need to fix this " + user + "!");
		}
	}

}

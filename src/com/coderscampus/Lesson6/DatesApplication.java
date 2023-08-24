package com.coderscampus.Lesson6;

import java.util.Date;

public class DatesApplication {

	public static void main(String[] args) {
		// Date imported via Java Util not SQL
		Date now = new Date(); // Variable name 'now' because when ran, the output will be present time
		System.out.println("Now: " + now);
		
		//Sql dates and times
		// Typically we don't use Java sql dates and times because a conversion that happen when we work with databases
		java.sql.Date jan011970 = new java.sql.Date(86400000); // Will output 'date'
		java.sql.Time time = new java.sql.Time(1); // Will output 'time'
		java.sql.Timestamp timeStamp = new java.sql.Timestamp(1); // Will output 'date and time'
		System.out.println("jan011970: " + jan011970);
		System.out.println("time: " + time);
		System.out.println("timeStamp: " + timeStamp);

	}

}
d
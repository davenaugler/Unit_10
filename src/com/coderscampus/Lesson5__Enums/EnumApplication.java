package com.coderscampus.Lesson5__Enums;

public class EnumApplication {

	public static void main(String[] args) {
		User user = new User("Dave", "asdf");
		System.out.println(user);
		if ("A".equals(user.getStatus().getAbreviatedStatus())) {
			System.out.println("User is ACTIVE");
		} else if ("I".equals(user.getStatus().getAbreviatedStatus())) {
			System.out.println("User is INACTIVE");
		} else if ("D".equals(user.getStatus().getAbreviatedStatus())) {
			System.out.println("User is DELETED");
		} else {
			System.out.println("We have no record of that user in our database");
		}
		
		// Another way of doing this
		// .name() represents the name of the enum constant
		// Ex. ACTIVE, INACTIVE, DELETED
		if ("ACTIVE".equals(user.getStatus().name())) {
			System.out.println("User is ACTIVE");
		}
		
		System.out.println("Ace primaryValue: " + Card.ACE.getPrimaryValue());
		System.out.println("Ace secondaryValue: " + Card.ACE.getSecondaryValue());
	}
	
	

}

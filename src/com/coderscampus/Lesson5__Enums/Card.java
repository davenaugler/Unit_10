package com.coderscampus.Lesson5__Enums;

public enum Card {
	
	ACE(14,1),
	TWO(2,2),
	THREE(3,3),
	FOUR(4,4),
	FIVE(5,5),
	SIX(6,6),
	SEVEN(7,7),
	EIGHT(8,8),
	NINE(9,9),
	TEN(10,10),
	JACK(11,10),
	QUEEN(12,10),
	KING(13,10);
	
	private Integer primaryValue;
	private Integer secondaryValue;
	
	private Card (Integer primaryValue, Integer secondaryValue) {
		this.primaryValue = primaryValue;
		this.secondaryValue = secondaryValue;
	}

	public Integer getPrimaryValue() {
		return primaryValue;
	}

	public void setPrimaryValue(Integer primaryValue) {
		this.primaryValue = primaryValue;
	}

	public Integer getSecondaryValue() {
		return secondaryValue;
	}

	public void setSecondaryValue(Integer secondaryValue) {
		this.secondaryValue = secondaryValue;
	}
	
}

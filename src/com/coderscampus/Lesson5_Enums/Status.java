package com.coderscampus.Lesson5_Enums;

public enum Status {
	// Capitals is the convention we use to denote
	// a constant, meaning that it does not change.
	ACTIVE("A"), 
	INACTIVE("I"),
	DELETED("D");
	
	private String abreviatedStatus;
	
	Status (String abreviatedStatus) {
		this.abreviatedStatus = abreviatedStatus;
	}

	public String getAbreviatedStatus() {
		return abreviatedStatus;
	}

	public void setAbreviatedStatus(String abreviatedStatus) {
		this.abreviatedStatus = abreviatedStatus;
	}
	
	

}

package com.coderscampus.Lesson1_Lesson4_OptionalKeyword;

import java.math.BigDecimal;
import java.util.Optional;

public class Recipe {

	private String name;
	private String instructions;
//	private Optional<BigDecimal> priceOpt; // Adding "Opt" at the end of the variable name price, indicates it's
											// Optional
	private Optional<BigDecimal> priceOpt = Optional.empty(); // If you need to assigning null to an Optional, this is how you do it
	// rather than assigning 'null' to it.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Optional<BigDecimal> getPriceOpt() {
		return priceOpt;
	} 

	// When setting an Optional you do not need the "Optional" data type wrapper around BigDecimal
	// When using Optional the point is to get away from using null. Don't put "null" where "price" is on line 38
	public void setPriceOpt(BigDecimal price) {
		this.priceOpt = Optional.of(price); 
		// will return a "NullPointerException"
//		this.priceOpt = Optional.ofNullable(null);
	}

	@Override
	public String toString() {
		return "Recipe [name=" + name + ", instructions=" + instructions + getPrice() + "]";
	}

	private String getPrice() {
		String priceString = priceOpt.map(price -> ", price=" + price)
									 .orElse(", price=free");
		return priceString;
	}
	
	
	
	

}

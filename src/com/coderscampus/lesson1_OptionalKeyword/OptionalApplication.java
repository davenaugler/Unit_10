package com.coderscampus.lesson1_OptionalKeyword;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		// Lesson 1
		Optional<String> fullName = Optional.of("Dave Naugler");
		
		System.out.println(fullName);
		
		System.out.println(fullName.get());
		
		String dave = fullName.get();
		System.out.println(dave);
		
		// Lesson 2
		Recipe brownies = new Recipe(); 
		System.out.println("---------");
		brownies.setName("Chocolate Chunk Brownies");
		brownies.setInstructions("1. Pre-heat oven\n2. Mix dry ingredients\n3. Mix wet ingredients\n4. Mix all ingredients\n5. Put in oven for 20 minutes");
//		System.out.println(brownies.getName());
//		System.out.println(brownies.getInstructions());
//		System.out.println(brownies);
		
		// Lesson 3
		brownies.setPriceOpt((new BigDecimal(9.99)));
		System.out.println(brownies);

	}

}

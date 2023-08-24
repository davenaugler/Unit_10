package com.coderscampus.Lesson1_Lesson4_OptionalKeyword;

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
//		brownies.setPriceOpt((new BigDecimal(9.99)));
//		System.out.println(brownies);
//		System.out.println(brownies.getPriceOpt().get());
		
		
		// Not a great way of handling it
//		if (brownies.getPriceOpt().isPresent()) {
//			BigDecimal price = brownies.getPriceOpt().get();
//			System.out.println(price);
//		} else {
//			System.out.println("Price is not present");
//		}
		
		// Returns "No value present" without a value
		// With value you get the value returned in a long number format
//		if (brownies.getPriceOpt() != null) {
//			System.out.println(brownies.getPriceOpt().get());
//		} else {
//			System.out.println("Price is not availablE yet");
//		}
		
		// No errors 
		// Will return what you give it inside the .orElse
		BigDecimal browniePrice = brownies.getPriceOpt()
			    				   .map(p -> p)
			    				   .orElse(new BigDecimal(0));
		System.out.println(browniePrice);
		
		// Lesson 4
		brownies.setPriceOpt(new BigDecimal(10.00));
		brownies.getPriceOpt()
				.ifPresent(RecipeService::billClient);
		
		

	}

}

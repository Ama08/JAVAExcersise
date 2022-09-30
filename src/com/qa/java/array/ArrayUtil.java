package com.qa.java.array;

public class ArrayUtil {

	int getSumOfArrayElements(int[] numbers) {

		// int[] numbers = {1,6,2,8,3,9,15,0};
		int sum = 0;

		for (int number : numbers) {

			sum += number;
		}

		return sum;

	}

	int getSmallestArrayElement(int[] numbers) {
		
		int smallNumber = numbers[0];
		
		for (int number : numbers) {
			
			if (number<smallNumber) {
				
				smallNumber = number;
			}
		}
		return smallNumber;
		
				
	}

	
	int getLargestArrayElement(int[] numbers) {

		int largeNumber = numbers[0];

		for (int number : numbers) {

			if (number > largeNumber) {

				largeNumber = number;
			}
		}
		return largeNumber;

	}
	
	int getEvenArrayElementCount(int[] numbers) {
		
		int count = 0;
		
		for (int number : numbers) {
			if (number %2 == 0) 
				
				count ++;
				
		}
		
		return count;
		
	}
	
	Product getSmallestPrice(Product[] prods ) {
		Product product = null;
		double smallestPrice = prods[0].price;
		//int smallestPrice = prod[0];
		for (Product prod : prods ) {
			if (prod.price < smallestPrice ) {
				
				smallestPrice = prod.price;			
				product = prod;				
			}
			
				}
		return product;
		
	}
}
	
	
	
	



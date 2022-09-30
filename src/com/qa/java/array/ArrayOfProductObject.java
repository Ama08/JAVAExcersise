package com.qa.java.array;

public class ArrayOfProductObject {
	public static void main(String[] args) {
				
		Product[] prod;
		prod = new Product[5];
		
		prod[0] = new Product(123564, "Bicsuit", 2.2, 4, 10, true);
		prod[1] = new Product(132564, "Milk", 3.2, 4, 20, true);
		prod[2] = new Product(32995679, "Caviar", 100, 3, 5, false);
		prod[3] = new Product(123564, "Cheese", 2.2, 6, 5, true);
		prod[4] = new Product(132564, "Tomatoes", 1.2, 3, 3, true);
		prod[5] = new Product(32995679, "Celery", 5, 3, 6, false);
		
		ArrayUtil arrayUtil = new ArrayUtil();
		System.out.println("The product with the smallest price: " + arrayUtil.getSmallestPrice(prod));
		
		}
	
	

}

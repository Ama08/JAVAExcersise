package com.qa.java.oopexcersise;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(123564, "Bicsuit", 2.2, 4, 10, true);
		product.displayProductInfo();
		System.out.println(product.name + " discount is: " + product.productDiscountPrice());
		System.out.println();
		/*
		 * product.id = 1258563; product.name = "Biscuit"; product.price = 2.2;
		 * product.discountPercentage = 10; product.isAvailable = 'y'; product.rating =
		 * 3;
		 */

		/*
		 * System.out.println("ID: " + product.id); System.out.println("Name: " +
		 * product.name); System.out.println("Price: " + "£" + product.price);
		 * System.out.println("Discount: " + product.discountPercentage);
		 * System.out.println("Availability: " + product.isAvailable);
		 * System.out.println("Rating: " + product.rating); System.out.println();
		 */
		Product product2 = new Product(132564, "Milk", 3.2, 4, 20, true);
		product2.displayProductInfo();
		System.out.println(product2.name + " discount is: " + product2.productDiscountPrice());
		System.out.println();
		/*
		 * product2.id = 3698563; product2.name = "Milk"; product2.price = 3.2;
		 * product2.discountPercentage = 20; product2.isAvailable = 'y'; product2.rating
		 * = 4;
		 */

		/*
		 * System.out.println("ID: " + product2.id); System.out.println("Name: " +
		 * product2.name); System.out.println("Price: " + "£" + product2.price);
		 * System.out.println("Discount: " + product2.discountPercentage);
		 * System.out.println("Availability: " + product2.isAvailable);
		 * System.out.println("Rating: " + product2.rating); System.out.println();
		 */

		Product product3 = new Product(32995679, "Caviar", 100, 3, 5, false);
		product3.displayProductInfo();
		System.out.println(product3.name + " discount price is: " + product3.productFinalPrice());
		System.out.println();
		/*
		 * product3.id = 96587563; product3.name = "Caviar"; product3.price = 100;
		 * product3.discountPercentage = 5; product3.isAvailable = 'N'; product3.rating
		 * = 4;
		 */

		/*
		 * System.out.println("ID: " + product3.id); System.out.println("Name: " +
		 * product3.name); System.out.println("Price: " + "£" + product3.price);
		 * System.out.println("Discount: " + product3.discountPercentage);
		 * System.out.println("Availability: " + product3.isAvailable);
		 * System.out.println("Rating: " + product3.rating);
		 */
		Product.sellerInfo();
		
	}

	

}

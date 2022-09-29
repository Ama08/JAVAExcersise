package com.qa.java.oopexcersise;

public class Product {
	
	int id;
	String name;
	double price;
	double rating;
	double discountPercentage;
	boolean isAvailable;
	final static String SELLER_NAME = "Nancy";
	final static long SELLER_CONTACT_NO = 12345678910L;
	final static String SELLER_EMAIL = "nancy@gmail.com";
	
	
	
	
	
	
	//no argument
	
	Product() {
		System.out.println("Product() constructor is called ");
		id = 125364;
		name = "Milk";
		price = 2.35;
		rating = 3;
		discountPercentage = 10;
		isAvailable = true;
		
			
	}


	public Product(int id, String name, double price, double rating, double discountPercentage, boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	void displayProductInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + "£" + price);
		System.out.println("Discount: " + discountPercentage);
		System.out.println("Availability: " + isAvailable);
		System.out.println("Rating: " + rating);
		System.out.println();
	}
	
	double productDiscountPrice() {
		return (price* discountPercentage/100);
	}
	
	double productFinalPrice() {
		return price - productDiscountPrice();
	}
	
	static void sellerInfo() {
		System.out.println("Name of seller: " + SELLER_NAME + "\n" + "Seller Phone number: " + SELLER_CONTACT_NO + "\n"+ "Seller eamil address: " + SELLER_EMAIL + "\n");
	}

}



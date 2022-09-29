package com.qa.java.array;

public class TestArray {

	public static void main(String[] args) {

		int[] numbers = {11,6,2,8,23,9,12,7};
		
//		for(int number : numbers) {
//			System.out.println(number);
//		}
		 ArrayUtil arraySum = new ArrayUtil();
		 int sum = arraySum.getSumOfArrayElements(numbers);
		 System.out.println("Sum of array is: " + sum);
		 
		 int smallNumber = arraySum.getSmallestArrayElement(numbers);
		 System.out.println("Smallest number of array is: " + smallNumber);
		 
		 int largeNumber = arraySum.getLargestArrayElement(numbers);
		 System.out.println("Largest number of array is: " + largeNumber);
		 
		 int countEvenNumber = arraySum.getEvenArrayElementCount(numbers);
		 System.out.println("Number of even numbers in array is: " + countEvenNumber);
		 
		 
		 
	}
	

}

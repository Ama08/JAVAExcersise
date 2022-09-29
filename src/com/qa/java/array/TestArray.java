package com.qa.java.array;

public class TestArray {

	public static void main(String[] args) {

		int[] numbers = {1,6,2,8,3,9,15,0};
		
//		for(int number : numbers) {
//			System.out.println(number);
//		}
		 ArrayUtil arraySum = new ArrayUtil();
		 int sum = arraySum.getSum(numbers);
		 System.out.println("Sum of array is: " + sum);
	}

}

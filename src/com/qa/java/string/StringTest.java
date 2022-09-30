package com.qa.java.string;



public class StringTest {

	public static void main(String[] args) {
		
		String words = "Hello how are you ";
		int numOfWords = StringTestUtil.countWords(words);
		System.out.println(numOfWords);
		
				
		String[] emails = {"abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
		int validEmail = StringTestUtil.validEmails(emails);
		System.out.println(validEmail);
         
        
		//char[] chs = stringOfWords.toCharArray();
		
				
		
	}

}

package com.qa.java.string;

public class StringTestUtil {
	
	static int countWords (String st) {
		
		return st.split(" ").length;
		
	}
	
	static int validEmails(String[] emails) {
		String regEx = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		int count = 0;
		for(String email : emails ) {
			if(!email.matches(regEx)) {
				count++;
			}
			
		}
	return count;

	}
	static int invalidEmails(String[] emails) {
		String regularEx = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		int count = 0;
		for(String email : emails ) {
			if(!email.matches(regularEx)) {
				count++;
			}
			
		}
	return count;

	}
	
}

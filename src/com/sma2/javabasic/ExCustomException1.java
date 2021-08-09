package com.sma2.javabasic;

//import java.io.IOException;

import java.io.IOException;

public class ExCustomException1 {
	
	static void ageValidate(int age) throws IOException   {
		if (age > 21) {
			System.out.println("Eligible to cast your vote, plz continue.....");
		} else {
			throw new IOException("Your age is below 21, Not elegible to cast your vote");
		    
		}
	}

	public static void main(String[] args) {
		int age = 15;
		try {
			ExCustomException1.ageValidate(age);
		} catch (IOException e) {
			System.out.println("Exception being handled..");
			// System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("Rest of the code");

	}

}
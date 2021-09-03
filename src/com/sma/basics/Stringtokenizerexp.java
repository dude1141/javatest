package com.sma.basics;

public class Stringtokenizerexp {
	
	static String str=" this is Java";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//using Split to break strings and it allow to use regualar expressions
		String[] a=str.split(" ");
		
		
		
		for(String r:a) {
			
			System.out.println("$$$$"+(r));
		}
			
		

	}

}

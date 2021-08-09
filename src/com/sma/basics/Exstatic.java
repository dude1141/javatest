package com.sma.basics;

public class Exstatic {

	
	public static String COUNTRY_NAME="INDIA";
	
	public String city="DELHI";
	
	public static void test1(){
		System.out.println("static method  in sma package");
		
	}
	
	static {
		System.out.println("static ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exstatic.COUNTRY_NAME;
		
		Exstatic n1=new Exstatic();
		System.out.println("AAABBBCC"+Exstatic.COUNTRY_NAME);
//		System.out.println("CITY------->"+Exstatic.'city');

		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAA"+n1.city);
		Exstatic.test1();
//		new Exstatic;
//		test1.
		
		
		
		
		
	}

}

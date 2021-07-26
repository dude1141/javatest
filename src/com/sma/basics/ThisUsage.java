package com.sma.basics;

public class ThisUsage {
	
	String name;
	int age;
	
	
	
	//default constructor, should have same name of class
	ThisUsage(){
		
		System.out.println("AABBBCC-------->");
		
	}
	
	
	
	ThisUsage(int age){
		this();
		//this() will call default constructor in line 11
		this.age=age;
		System.out.println("Single PArameterised constructor");
		
	}
	
	
	//this is the method
	void process(){
		
		System.out.println("print process");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ThisUsage n1=new ThisUsage( 20);
			n1.getClass();
			
			
			
			
			
			
		

	}

}

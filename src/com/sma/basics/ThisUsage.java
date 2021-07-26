package com.sma.basics;

public class ThisUsage {
	
	String name;
	int age;
	
	
	
	//default constructor, should have same name of class
	ThisUsage(){
		
		System.out.println("AABBBCC-------->");
		
	}
	
	
	
	ThisUsage(int age){
		this();//invoking line 11 constructor in 19th line constructor
		this.age=age;
		System.out.println("Single PArameterised constructor");
		
	}
	
	
	//this is the method
	void process(){
		
		System.out.println("print process");
		}
	
		
	//getObject is a method of return type ThisUsage object
	ThisUsage getObject() {
		
		return this;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ThisUsage n1=new ThisUsage( 20);
			n1.getClass();
			
			n1.getObject();
			
			
			
			
			
			
		

	}

}

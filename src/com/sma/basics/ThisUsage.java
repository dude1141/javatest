package com.sma.basics;

public class ThisUsage {
	
	String name;
	int age;
	
	
	
	//default constructor, should have same name of class
	ThisUsage(){
		
		System.out.println("AABBBCC-------->");
		
	}
	
	
	
	ThisUsage(int age){
<<<<<<< HEAD
		this();//invoking line 11 constructor in 19th line constructor
=======
		//this() will call default constructor in line 11
>>>>>>> 33f06095616b94aef66ab4d9a57deb09d0ff81c7
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

package com.sma2.javabasic;
//package com.icici.inheri;

class Parent2 {
	
	
	
	public Parent2() {
	
		System.out.println("constructor from Parent class  ");
	}
	
	
	int id;
	//parametrised contructor
	public Parent2(int id) {
		this.id=id;
		
		System.out.println("constructor from Parent class  ");
	}
	
	
	
	public void test1() {
		
		System.out.println("Hi i am parent");
	}
	
}

	
public class child2 extends Parent2{
	
	//if you comment default constructor in parent(line 8,9,10) ,it will give an erroras below
	// Implicit super constructor Parent2() is undefined. Must explicitly invoke another constructor
	
	
	//Compiler invokes parent class default constructor irrespective even though there is child class constructor
	//construct child2 in child class
	public child2() {
		
		System.out.println("constructor from child2 class  ");
	}
	
	
	String name;
	public child2(String name) {
		this.name=name;
		
		System.out.println("constructor from child2 class  ");
	}
		
		
		public void test2() {
			
			System.out.println("i am child ");
	}
	
	
	
	public static void main(String[] args) {
		
		child2 n1=new child2("thokka");
		n1.test2();
		n1.test1();
		
		
		// TODO Auto-generated method stub

	}


}
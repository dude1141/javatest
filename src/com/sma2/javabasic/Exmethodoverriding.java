
package com.sma2.javabasic;


class Parent3 {
	
	public void test1() {
		
		System.out.println("Hi i am parent");
	}
	
}

	
 public class Exmethodoverriding extends Parent3{

	 //we are overriding the method defined in parent3 in class Exmethodoverriding
	 //want to implement differently functionality for same method then we use this one
		
		@Override 
		public void test1() {
			
			System.out.println("i am child ");
	}
	
	
	
	public static void main(String[] args) {
		
		Exmethodoverriding n1=new Exmethodoverriding();
//		n1.test2();
		n1.test1();
		
		
		// TODO Auto-generated method stub

	}


}

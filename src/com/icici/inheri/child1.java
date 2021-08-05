package com.icici.inheri;

  class Parent1 {
	
	public void test1() {
		
		System.out.println("Hi i am parent");
	}
	
 }

	
  public class child1 extends Parent1{
		
		
		public void test2() {
			
			System.out.println("i am child ");
	}
	
	
	
	public static void main(String[] args) {
		
		child1 n1=new child1();
		n1.test2();
		n1.test1();
		
		
		// TODO Auto-generated method stub

	}


}
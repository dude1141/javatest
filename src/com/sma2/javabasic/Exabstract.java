package com.sma2.javabasic;


abstract class Bank{
	
//	abstract void test1();
	
	 public void test2() {
		// TODO Auto-generated method stub
		
	}
	 
		public abstract int getROI();//abstract class allow nonabstract asweel as abstract methods


	void test3() {
		System.out.println("Hi i am method.in parent class.......");

	}
	
	
	
	
	
}
public  class Exabstract extends Bank{
	
	
	//child class Exabstract must implement parent class abstract method

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Exabstract ab=new Exabstract();
		
//		Bank abc=new Exabstract();
//		abc.test2();
//		abc.test1();
		ab.test2();
		ab.test3();
	
	
			
	}


//below is method overriding,compiler will check if below getROI is declared in parent class or not
	@Override
	public int getROI() {
		return 0;
	}



//	@Override
//	void test1() {
//		// TODO Auto-generated method stub
//		
//	}

}

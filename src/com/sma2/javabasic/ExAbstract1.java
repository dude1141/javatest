package com.sma2.javabasic;


abstract class Bank1 {
	
	public Bank1() {
		System.out.println("Default constructor from Abstract class...");
	}
	public abstract int getROI();
	void test1() {
		System.out.println("Method from Abstract class..");
	}
	
}

public class ExAbstract1 extends Bank1{

	@Override
	public int getROI() {
		System.out.println("Calculating ROI....");
		return 7;
	}
	public static void main(String[] args) {

		ExAbstract1 e1 = new ExAbstract1();
		e1.getROI();
		e1.test1();
		
		Bank1 bank = new ExAbstract1();
		bank.getROI();
		
	}

}

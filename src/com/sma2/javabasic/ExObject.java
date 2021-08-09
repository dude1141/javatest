package com.sma2.javabasic;

public class ExObject implements Cloneable{

	public static void main(String[] args) {
		
		
		ExObject e=new ExObject();
		
		try {
		
//		Object objj = (ExObject)c.newInstance();
//			ExObject e1=e.clone();  // Type casting
			//it will give error because clone method return type is object
			//but you are assinging to child class exobject instead of Object class
			//you cannot assing parent class object to child but viceversa possible
			
			ExObject e1=(ExObject)e.clone();//(ExObject) will help in casting
			
			//we have to use implements cloneable to prevent clonenotsupportedexception
			
	} catch (CloneNotSupportedException e1) {
		System.out.println("Exception Occurred--->");
		e1.printStackTrace();
		
		
	}
		
		
		try {
			ExObject cc = (ExObject)e.getClass().newInstance();
			
		} catch (InstantiationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IllegalAccessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

}
}
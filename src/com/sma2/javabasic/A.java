package com.sma2.javabasic;

public interface A {
//	int x1--- this is not allowed in interface
	// final variable should be assinged
	
	//interfaces cannot have constructors
	//interfaces are also pure abstract class
	//interfaces should be implemented using "implements" keywrod where as abstract class we use "extend"
	//abstract class allow both abstract method and normal methods
	
	// default method or static method in interface ccannot be ovverwritten 
	//one interface can extend more than one interface
	//if a class extends more than one class not possible, because imoplmentation of mehtods is in parent class only
	//but a class can implement more than one interface
	//interfaces --allow multiple inheritence
	
	public static final int x1 = 0;
	int y=9;
	void test1();//by  default compiler apply  "public abstract acess" modifier in interface

}

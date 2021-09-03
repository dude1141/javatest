package com.sma2.javabasic;

import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList A1=new ArrayList();
		ArrayList<String> A2=new ArrayList<String>();
		
		//<String> is type of object that we add to array list ,its concepts called Generic
		A2.add("AAA");
//		A1.add(100);
		A2.add("JAVA");
		
		System.out.println(A1);
		//internally it uses dynamic array
		
		
		for(Object obj:A1) {
			String lang=(String)obj;
			System.out.println(lang);
		}

		
		for(String x:A2) {
			System.out.println(x);
		}


	}

}

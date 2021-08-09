package com.sma.basics;

public class Exarray {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50};
		// TODO Auto-generated method stub

		
//		int i=10;
		for (int i=0;i<=a.length;i++){
				
			System.out.println("i@@@@@@"+a[i]);
			System.out.println("value of i is"+i);
			
		}
		
		
		//r:a r is reference and a is the array
		
		for (int r:a) {
			
			System.out.println("array-------->>"+r);
		}
		
		
		String languages[]= {"Cricket","Tennis"};
		
		for (String y:languages) {
			
//			System.out.println("Games arraydisplay-------->>"+y);
		}
		
		
	}

}

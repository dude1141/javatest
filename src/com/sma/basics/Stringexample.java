package com.sma.basics;

public class Stringexample {
	
	

	public static void main(String[] args) {
		
		 //String literal ,stores s1 object in seperate stringconstatnt pool in heap area and is immutable
		String s1="Arya Ind";
		String s2="Arc Ind";
		String s3 = new String("Arya Ind");

		
		
		byte[] a=s1.getBytes();
		
		for(byte aa:a) {
			
//			System.out.println("Java byte array printing "+aa);
		}
			
		
		
		System.out.println("compare using equals----->"+s1.equals(s2));

		
		System.out.println("compare using equals----->"+s1.equals(s3));
		
		System.out.println("compare using Compare---->"+s1.compareTo(s3));
		
		//s1 ==s3 will be false because s1 is literal and s3 is in different location in memory
		System.out.println("compare using =="+s1==s3);

	}

}

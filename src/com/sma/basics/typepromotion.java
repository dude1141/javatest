package com.sma.basics;

public class typepromotion {
	
	
	public void calculate(int x, int y) {
		
		int sum=x+y;
		System.out.println("Sum is "+sum);
		
	}


		public static void main(String[] args) {
			
			
			int[] a= {10,20,30,40,50};
			// TODO Auto-generated method stub
			
			typepromotion n1=new typepromotion();
			
			//'A' is promoted to int A has some ascii value
			
			n1.calculate(10, 'A');
			

			
				
				
			}
			
			
		}

	


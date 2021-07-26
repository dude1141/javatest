package com.sma.basics;

public class overloadingexmp {



		//having same method name but different arguements
		public void sum(int x, int y) {

			int a = x + y;
			System.out.println("Sum of x & y(int) = " + a);
		}
		
		/*public int sum(int x, int y) {

			int a = x + y;
			System.out.println("Sum of x & y(int) = " + a);
			return a;
		}*/
		public void sum(int x, int y,int z) {

			int a = x + y +z;
			System.out.println("Sum of x, y & z = " + a);
		}
		public void sum(float x, float y) {

			float a = x + y;
			System.out.println("Sum of x & y(float) = " + a);
		}

		public static void main(String[] args) {
			
			overloadingexmp m1 = new overloadingexmp();
			m1.sum(10, 20);
			m1.sum(50, 50, 50);
			m1.sum(10.3f, 20.5f);

		}

	}

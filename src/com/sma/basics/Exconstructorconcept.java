package com.sma.basics;

public class Exconstructorconcept {
	
	int Eid;
	String Name;

	
	
	//constructor use , to initialize data to the object
	public Exconstructorconcept() {
		System.out.println("Defautlt constructor");
	}
	
	
	//this is parameetrised constructor
	public Exconstructorconcept(int x ,String Name) {
		System.out.println("Parameterised constructor");
		
		Eid=x;
//		Name=y;
		this.Name=Name;
	}
	
	//getEmpdata is a method
	public  void getEmpdata() {
		
		System.out.println("Eid"+Eid+","+"Name"+Name);
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Exconstructorconcept n1=new Exconstructorconcept();
		Exconstructorconcept n2=new Exconstructorconcept(2,"Hello");
		
		//using method
		Exconstructorconcept n3=new Exconstructorconcept(3,"Hello2");
		n3.getEmpdata();

		
		
		// TODO Auto-generated method stub

	}

}

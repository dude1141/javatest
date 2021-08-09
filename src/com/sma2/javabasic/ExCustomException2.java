package com.sma2.javabasic;

class AgeException extends Exception{
	
	private String description;
	
	AgeException(String description){
		this.description=description;
	}
	public String getExceptionDescription(){
		return description;
	}
}

public class ExCustomException2 {

	static void ageValidate(int x) throws AgeException    {

		if (x < 21)
			throw new AgeException("Age Exception, you are not eligible to cast your vote !!!");
		else
			System.out.println("Candidate is Eligible to vote !!!");

	}
	
	public static void main(String[] args) {
		
		try {
			ageValidate(15);
		} catch (AgeException a) {
			System.out.println("Exception occured --->"+a.getExceptionDescription());
			a.printStackTrace();
		}
		System.out.println("End of the program !!!");
		
	}

}

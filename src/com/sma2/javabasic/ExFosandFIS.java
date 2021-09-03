package com.sma2.javabasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExFosandFIS {
	public static void main(String[] args) {
		
		String inputData = "This is an example of FIS & FOS1";
		FileOutputStream fos = null;
		FileInputStream fis = null;
		byte[] bb = inputData.getBytes();
		
		try {
			fos = new FileOutputStream("OutputFile.txt");
			fos.write(bb);
			System.out.println("Data has been successfully written to the file..");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			int x;
			fis = new FileInputStream("OutputFile.txt");
			System.out.println("Reading the data from OutputFile.txt.. ");
			//int x = fis.read();
			while((x=fis.read())!=-1){
				System.out.print((char)x);
			}
			
			//System.out.println((char)x);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package com.java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	public static void main(String...args) throws IOException
	{
		FileWriter f = new FileWriter("abc.txt");
		f.write("my name is bad");
		System.out.println("file write succesful.....");
		f.close();
		
		FileReader f1 = new FileReader("abc.txt");
		int i=0;
		while((i=f1.read()) != -1)
		{
			System.out.println((char)i);
		}
		System.out.println("file read succesfull...");
		f1.close();
	}
}

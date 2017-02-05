package com.java;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String...sagar)throws IOException
	{	
		CharArrayWriter c= new CharArrayWriter();
		c.write("my name is sagar");
		
		FileWriter f1 = new FileWriter("xyz.txt");
		FileWriter f2 = new FileWriter("mnl.txt");
		FileWriter f3 = new FileWriter("iop.txt");
		FileWriter f4 = new FileWriter("rst.txt");
		
		c.writeTo(f1);
		c.writeTo(f2);
		c.writeTo(f3);
		c.writeTo(f4);
		
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		
		System.out.println("write to the files succesful...");
	
	}
}

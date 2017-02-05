package com.java;

import java.io.CharArrayReader;
import java.io.IOException;

public class Demo3 {
	public static void main(String...optional) throws IOException
	{
		String name = "my name is khan";
		int n = name.length();
		char c1[] = new char[n];
		
		name.getChars(0, n, c1, 0);
		CharArrayReader input1 = new CharArrayReader(c1);
		CharArrayReader input2 = new CharArrayReader(c1,0,6);
		
		int i=0;
		System.out.println("reading input file 1");
		while((i=input1.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		input1.close();
		
		System.out.println("reading input file 2");
		while((i=input2.read())!=-1)
		{
			System.out.println((char)i);
		}
		input2.close();
	}
}

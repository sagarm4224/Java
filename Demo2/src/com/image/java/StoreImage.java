package com.image.java;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreImage {
	public static void main(String...args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sagar","root","1234");
			
			PreparedStatement p = con.prepareStatement("insert into imagetable values(?,?)");
			
			p.setString(1,"sagar");
			 FileInputStream f = new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Demo2.jpg");
			 p.setBinaryStream(2, f, f.available());
			 
			 int i=p.executeUpdate();
			 System.out.println(i+"records affected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

package com.image.java;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImage {
	public static void main(String...sagar)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sagar","root","1234");
			
			PreparedStatement p = con.prepareStatement("select * from imagetable");
			ResultSet rs = p.executeQuery();
			
			if (rs.next())
			{
				Blob b = rs.getBlob(2);
				byte b1[] = b.getBytes(1,(int)b.length());
				FileOutputStream f = new FileOutputStream("C:\\Users\\Sagar\\Downloads\\image1.jpg");
				f.write(b1);
				f.close();
			}
		System.out.println("write OK");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}

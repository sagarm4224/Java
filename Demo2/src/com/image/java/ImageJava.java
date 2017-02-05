package com.image.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageJava {
	public static void main(String...sagar) throws IOException
	{
		int width = 100;
		int height = 200;
		
		BufferedImage bf = null;
		File f = null;
		
		f = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Demo.jpg");
		bf = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		bf = ImageIO.read(f);
		System.out.println("Image read is succesful");
		
		f= new File("C:\\Users\\Sagar\\Downloads\\Demo.jpg");
		ImageIO.write(bf, "jpg", f);
		System.out.println("Image write is successful");
	}
}

package com.image.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

class filechoser extends JFrame implements ActionListener
{
	JFileChooser jf = new JFileChooser();
	JButton jb = new JButton("Browse your file");
	JTextField jt = new JTextField(30);
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class Filebrowser {
	public static void main(String...sagar)
	{
		JFrame j = new filechoser();
		j.setVisible(true);
		j.setBounds(200,200,400,200);

	}
}

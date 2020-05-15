package com.exception_handling_deepak;

import java.io.FileInputStream;

public class Checked_And_UnChecked_Exception_Example {

	public static void main(String[] args) {
		
		try
		{

		
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		}
		catch(Exception e)
		{
		
			System.out.println(e);
		}
		
		
		
		
	}

}

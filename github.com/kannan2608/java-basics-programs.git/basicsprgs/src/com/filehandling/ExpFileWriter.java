package com.filehandling;
import java.io.*;
public class ExpFileWriter {

	public static void main(String[] args) {
		String data=" welcome to the our class";
		try
		{
			FileWriter obj=new FileWriter("sam.txt",true);
			obj.write(data);
			obj.close();
			System.out.println("sucessfully Executed");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

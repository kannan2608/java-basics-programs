package com.filehandling;

import java.io.*;

public class FileReader {

	public static void main(String[] args) {
		
		 
		    	try{    
		          FileReader obj=new FileReader(‪"‪E:\\kannan\\Feb\\Java.txt");    
		          int i;    
		          while((i=obj.read())!=-1)    
		          System.out.print((char)i);    
		          obj.close();  
		          }
		    	catch(Exception e)
		    	{
		    		System.out.println(e);
		    	}
		}
}

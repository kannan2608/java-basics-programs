package com.filehandling;

import java.io.*;

public class FileReader {

	public static void main(String[] args) {
		
		 
		    	try{    
		          FileReader obj=new FileReader();    
		          int i;    
		          while((i=obj.read())!=-1)    
		          System.out.print((char)i);    
		          obj.clone();  
		          }
		    	catch(Exception e)
		    	{
		    		System.out.println(e);
		    	}
		}

	public int read() {
		// TODO Auto-generated method stub
		return 0;
	}
}

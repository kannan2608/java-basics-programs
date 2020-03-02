package com.filehandling;

public class FileReader1 {

	public static void main(String[] args) {

		
		// Reading data from a file using FileReader 
		        int ch; 
		  
		        FileReader fr=null; 
		        try
		        { 
		            fr = new FileReader("text"); 
		        } 
		        catch (FileNotFoundException fe) 
		        { 
		            System.out.println("File not found"); 
		        } 
		  
		        while ((ch=fr.read())!=-1) 
		            System.out.print((char)ch); 
		  
		        fr.close(); 
		    } 
		} 
			}

}

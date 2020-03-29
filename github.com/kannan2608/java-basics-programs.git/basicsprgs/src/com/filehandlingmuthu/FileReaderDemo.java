package com.filehandlingmuthu;

import java.io.File;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		/*// 1. create a folder and more then one
		 * 
		 * File file=new File("‪C:\\Users\\Kannan\\Desktop\\ranja\\rani\\mandhiri");
		 * boolean present=file.exists(); System.out.println("folder presend:"+
		 * present); if(present==false) file.mkdirs();
		 * 
		 * present=file.exists(); System.out.println("folder presend:"+ present);
		 * 
		 */
/*           //2.  create a txt ffile in a folder
		File file = new File("‪C:\\Users\\Kannan\\Desktop\\ranja\\text.txt");
		boolean present = file.exists();
		if (present == false)
			try {
				boolean created = file.createNewFile();
				System.out.println("file created" + created);

			}

			catch (IOException e) {
				e.printStackTrace();
			}
*/
		
		
		/*    3. delete the file
		
		File file=new File("‪C:\\Users\\Kannan\\Desktop\\ranja\\text.txt");
		file.delete();
		boolean present=file.exists();
		System.out.println("file is prsent:"+present);
		
		*/
		
		/*
		
		
		// 4. file rename and  file name print
		
		File file=new File("‪C:\\Users\\Kannan\\Desktop\\ranja\\text.txt");
		file.createNewFile();
		File newName =new File("‪C:\\Users\\Kannan\\Desktop\\ranja\\kans.txt");
		boolean renameSuccess=file.renameTo(newName);
		System.out.println("renameSuccess"+ renameSuccess);
		
		System.out.println("file name"+file.getName());
	
		
		System.out.println(file.canExecute());
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		*/
		
		
		
		//5 file folder list
		
		File file=new File("‪C:\\Users\\Kannan\\Desktop");
		String[] listOfFilesFolders=file.list();
		/*for(int i=0; i<listOfFilesFolders.length; i++)
			System.out.println(listOfFilesFolders[i]);*/
		// using for each loop
		for(String s:listOfFilesFolders)
			System.out.println(s);
		
		//particular file
		File file1=new File("‪C:\\Users\\Kannan\\Desktop");
		File[] filefolderList=file1.listFiles();
		for(File f:filefolderList)
			System.out.println(f);  

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

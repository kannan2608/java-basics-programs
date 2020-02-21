package com.app.prgs;
import java.util.Scanner;

public class AreaofTriangle // area=0.5f*base*height
{

	public static void main(String[] args) 
	{
	  
		 Scanner obj=new Scanner(System.in);
		 float area,base,height;
		 System.out.println("Enter the base of triangle");
		 base=obj.nextFloat();
		 System.out.println("Enter the height of triangle");
		 height=obj.nextFloat();
		 area=0.5f*base*height;
		 System.out.println("The Triangle is ="+area);
		 
		 
		 
	}

}

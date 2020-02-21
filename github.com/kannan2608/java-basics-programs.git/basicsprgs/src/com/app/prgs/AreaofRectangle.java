package com.app.prgs;
import java.util.Scanner;

public class AreaofRectangle // formula area=height*width
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int area,height,width;
		System.out.println("Enter the height");
		height=obj.nextInt();
		System.out.println("Enter the width");
		width=obj.nextInt();
		area=height*width;
		System.out.println("The are of the Rectangle is = "+ area);
		
		
	}

}

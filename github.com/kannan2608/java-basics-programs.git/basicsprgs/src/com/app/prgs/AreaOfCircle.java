package com.app.prgs;
import java.util.Scanner;

public class AreaOfCircle// area=3.14*radius*radius
{

	public static void main(String[] args) 
	{
		 Scanner obj=new Scanner(System.in);
		 float area,radius;
		 System.out.println("Enter the radius of cricle");
	     radius=obj.nextFloat();
	     area=3.14f*radius*radius;
	     System.out.println("The Area of triangle is = "+area);
	}

}

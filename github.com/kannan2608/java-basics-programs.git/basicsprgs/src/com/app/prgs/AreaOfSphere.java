package com.app.prgs;
import java.util.Scanner;

public class AreaOfSphere //area=4*3.14f*radius*radius
{

	public static void main(String[] args) 
	{
	  Scanner obj=new Scanner(System.in);
	  float area,radius;
	  System.out.println("Enter the Radius of sphere");
	  radius=obj.nextFloat();
	  area=4*3.14f*radius*radius;
	  System.out.println("Area of Sphere is = "+area);
	  
	}

}

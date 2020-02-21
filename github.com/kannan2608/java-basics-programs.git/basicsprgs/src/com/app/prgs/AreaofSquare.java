package com.app.prgs;
import java.util.Scanner;

public class AreaofSquare // area= side*side
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int area,side;
		System.out.println("enter the side");
		side=obj.nextInt();
		area=side*side;
		System.out.println("The Square is = "+area);
		
		
	}

}

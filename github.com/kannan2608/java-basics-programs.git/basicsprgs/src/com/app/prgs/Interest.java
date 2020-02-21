package com.app.prgs;
import java.util.Scanner;

public class Interest // interest=(principle*rate*time)/100
{

	public static void main(String[] args) 
	{
		
	   Scanner obj=new Scanner(System.in);
	   float si,p,r,t;
	   System.out.println("Enter the Priciple Amount");
	   p=obj.nextFloat();
	   System.out.println("Enter the rate of Interest");
	   r=obj.nextFloat();
	   System.out.println("Enter the Time");
	   t=obj.nextFloat();
	   si=(p*r*t)/100;
	   System.out.println("Rate of Interest of = "+si);
	   
	}

}

package com.array;

public class IndexEvenNum 
{

	public static void main(String[] args)
	{
		int[] joy= {15,55,20,50,60,88,97,11};
		  
		  for(int i=0;i<joy.length; i++)
		  {
			  if(i%2==0)
			  {
				  System.out.println(joy[i]);
		  }
		  }
	} 
}

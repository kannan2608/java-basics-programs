package com.array;

public class OddNum  //element using odd numbers
{

	public static void main(String[] args) 
	{
		int[] joy= {15,55,20,50,60,88,97,11};
		  
		  for(int i=0;i<joy.length; i++)
		  {
			  if(joy[i]%2==1)
			  {
				  System.out.println(joy[i]);
		  }
		  }
	}

}

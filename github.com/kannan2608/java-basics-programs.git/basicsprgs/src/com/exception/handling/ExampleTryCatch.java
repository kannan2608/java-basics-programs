package com.exception.handling;

public class ExampleTryCatch
{

	public static void main(String[] args)
	{
          System.out.println(1);
          System.out.println(2);
          
          try
          {
        	int a=10/0;
                	  
          }
          
          catch(Exception e)
          {
        	  System.out.println(e.getMessage());
        	  
          }
 
         System.out.println(3);
         System.out.println(4);
	}

		 
}

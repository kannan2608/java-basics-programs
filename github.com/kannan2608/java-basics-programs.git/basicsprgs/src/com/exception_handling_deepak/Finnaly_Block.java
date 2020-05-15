package com.exception_handling_deepak;

public class Finnaly_Block {

	public static void main(String[] args) {
		
		try
		{
			int a=20, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		/*
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		finally
		{
			System.out.println("i m in finally block");
		}
		
		/*try
		 * {
		 *risky code
	       }
	       catch(Exception e)
	       {
	       handling code
	       }
	       finally
	       {
	       cleanup code
	       }
	
		 * 
		 */
		
		
	}

}

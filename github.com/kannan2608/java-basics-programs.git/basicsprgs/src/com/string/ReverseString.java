package com.string;

public class ReverseString
{

	public static void main(String[] args) 
	{
		
		 StringBuffer obj = new StringBuffer("Hiding internal details and showing functionality is known as abstraction.");
	     System.out.println(obj.reverse());
	     System.out.println(obj.capacity());
		 System.out.println(obj.length());
		 obj.append("hiiiiiiiii");
		 System.out.println(obj);
	}

}

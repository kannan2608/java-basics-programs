package com.string;

public class WordCount 
{

	public static void main(String[] args) 
	
	{
		String s = "If one task is performed in different ways, it is known as polymorphism. ";
		 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}

}



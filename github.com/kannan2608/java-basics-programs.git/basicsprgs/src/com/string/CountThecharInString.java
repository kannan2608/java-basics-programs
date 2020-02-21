package com.string;

public class CountThecharInString
{

	 static int countOccurrences(String str, char ch) 
		{
			int counter = 0;
			
			for (int i = 0; i < str.length(); i++) 
			{
				if (str.charAt(i) == ch) 
				{
					counter++;
				}
			}

			return counter;
		}

		public static void main(String[] args)
		{
			String str = "If one task is performed in Different ways, it is Known as polymorphism.";
			char ch = 'f';

			System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times.");
		}
}

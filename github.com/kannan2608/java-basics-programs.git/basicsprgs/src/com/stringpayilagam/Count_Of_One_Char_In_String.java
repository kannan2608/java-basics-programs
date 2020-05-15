package com.stringpayilagam;

public class Count_Of_One_Char_In_String {

	public static void main(String[] args) {
		String word="To join a company where I can solve the problem in a creative manner and develop my knowledge which would help for the development of the company";;
		char search='m';
		
		int count=0;
	
		for(int i=0; i<=word.length()-1; i++)
		{
			if(search==word.charAt(i))
			{
				count++;
			}
		}
		System.out.println("count of "+search+ " is = "+count);
	}

}

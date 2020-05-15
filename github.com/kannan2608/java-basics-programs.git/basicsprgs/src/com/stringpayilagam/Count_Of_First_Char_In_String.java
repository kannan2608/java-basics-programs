package com.stringpayilagam;

public class Count_Of_First_Char_In_String {

	public static void main(String[] args) {
		
		
		String word="abvfedflaaxfkgjaaavnmglesa";
	char first=	word.charAt(0);
	
	int count=1;
	for(int i=1; i<=word.length()-1; i++)
	{
		if(first==word.charAt(i))
		{
			count++;
		}
		
	}
	System.out.println("count of first char is=" + count);

	
	}

}

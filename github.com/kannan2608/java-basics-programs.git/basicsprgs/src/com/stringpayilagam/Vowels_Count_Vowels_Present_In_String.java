package com.stringpayilagam;

public class Vowels_Count_Vowels_Present_In_String {

	public static void main(String[] args) {
		
		
		String word="education education";
		int count=0, countofa=0, countofi=0;
		
		for(int i=0; i<=word.length()-1; i++)
			
		{
			char ch=word.charAt(i);
			switch(ch)
			{
			case 'a': countofa++;
			case 'e':
			case 'i':countofi++;
			case 'o':
			case 'u':
				
		
			}
		}
		
		if(count==0)
		{
			System.out.println("vowels is not preset");
		}
		else
			System.out.println("vowles is present");
		
		System.out.println("count of given string in vowels= "+count);
		System.out.println("count of a is presetn in "+ countofa+  "times");
		System.out.println("i is preset in"    +countofi+   "times");
		
		
		
		
		
		
		
	}

}

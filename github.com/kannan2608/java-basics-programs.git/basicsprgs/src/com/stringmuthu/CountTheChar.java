package com.stringmuthu;

public class CountTheChar {

	public static void main(String[] args) {
		int count=0;
		String name="The CharSequence interface is used to represent the sequence of characters.";
		char ch='e';
		int c=(int)ch;
		c=c+32;
		char cap=(char)c;
		
		int j=(int)ch;
		char[] nameArr=name.toCharArray();
		for(int i=0; i<nameArr.length;i++)
		{
			//if((nameArr[i]==ch)||(nameArr[i]==cap))
			if((name.charAt(i)==ch)||(name.charAt(i)==cap))
			{
				count++;
			}
		}
		System.out.println("e appears="+count);
		//System.out.println(j);
		
	}
	
 
}

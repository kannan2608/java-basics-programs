package com.stringmuthu;

public class ReverseInString {

	public static void main(String[] args) {
		String str="kannan";
		char[] ch=str.toCharArray();
				for(int i=str.length()-1; i>=0; i--)
				{
					System.out.println(ch[i]);
				}
				
	}

}

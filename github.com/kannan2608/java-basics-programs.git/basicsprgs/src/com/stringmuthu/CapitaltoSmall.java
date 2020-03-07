package com.stringmuthu;

public class CapitaltoSmall {
	
	public static void main(String[] args)
	{
		String s="KaNnAn is a BaD Boy";
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			char c=ch[i];
			int asc=(int)c;
			if((asc>=65)&&(asc<=91))
			{
				System.out.println((char)(asc+32));
			}
			else if((asc>=97)&& (asc<=122))
			{
				System.out.println((char)(asc-32));
			}
			else 
			{
				System.out.println(ch[i]);
			}
		}
	}

}

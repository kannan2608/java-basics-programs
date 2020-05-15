package com.array_payilagam_vedio_prgms;

public class Liner_Search_String_Array {

	public static void main(String[] args) {
	String a[]= {"kannan","koks","abd","jk"};
	String  key="lkfk";
	int temp=0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i].equals(key))
		{
			System.out.println(key +  "is present at"+i+"index position");
			temp=temp+1;
		}
		
	}
	if(temp==0)
	{
		System.out.println("Key is not present");
	}
	}

}

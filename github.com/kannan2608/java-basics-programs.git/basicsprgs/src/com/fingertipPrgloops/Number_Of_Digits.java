package com.fingertipPrgloops;

public class Number_Of_Digits {

	public static void main(String[] args) {
		int no=12345;
		int count=0;
		while(no>0)
		{
			no=no/10;
			count++;
		}
		System.out.println("The Number of Digits is="+count);
	}

}

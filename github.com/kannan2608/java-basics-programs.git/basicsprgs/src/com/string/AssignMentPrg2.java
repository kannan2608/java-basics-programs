package com.string;

public class AssignMentPrg2 {

	public static void main(String[] args) 
	{
		int no = 11511;
		int no1=no;
		int rev = 0;
		while (no > 0) {
			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		if(no1==rev)
		
			System.out.println("is a Palindrome");
		else
		{
			System.out.println("is not a palindrome");
		}
	}
	}


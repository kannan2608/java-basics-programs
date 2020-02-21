package com.string;
import java.util.*;

public class ReverseString1 
{

	public static void main(String[] args) 
	{
		String original, reverse = "";
	    Scanner obj = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = obj.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
	  }
	}

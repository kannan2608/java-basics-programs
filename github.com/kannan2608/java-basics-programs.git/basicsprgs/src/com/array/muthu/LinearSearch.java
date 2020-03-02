package com.array.muthu;

public class LinearSearch {

	public static void main(String[] args) {
		boolean nopresent=false;
		
		int[] marks= {91,55,93,55,88};
	
		for(int i=0; i<marks.length; i++)
		{
			nopresent=true;
		if(marks[i]==105)
		{
			System.out.println("i got it");
			break;
			
		}
		if(nopresent==false)
		{
			System.out.println("mark is not present");
			
		}
		}
		
	}

}

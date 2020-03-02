package com.array.muthu;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		int len=obj.nextInt();
		//int[] marks= new int[5];
		int[] marks=new int[len];
		for(int i=0; i<len; i++)
		{
			System.out.println("enther the mark");
			//marks[i]= obj.nextInt();
			marks[i]=obj.nextInt();
		}
		
				
		
	}

}

package com.array.muthu;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
          int total=0;
		 Scanner obj=new Scanner(System.in);
		 int len=obj.nextInt();
		 int[] marks=new int[len];
		 for(int i=0;i<len;i++)
		 {
			 System.out.println("Enter the marks");
			 marks[i]=obj.nextInt();
			 total=total+marks[i];
			 
		 }

		 System.out.println(total);
		 obj.close();
	}

}

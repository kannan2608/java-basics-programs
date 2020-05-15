package com.fingertipPrgloops;

import java.util.Scanner;

public class Print_Any_Tables_User_Input {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int no;
		System.out.println("Enter Any Number");
		no=obj.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"*"+no+"="+i*no);
		}
		
		}

}

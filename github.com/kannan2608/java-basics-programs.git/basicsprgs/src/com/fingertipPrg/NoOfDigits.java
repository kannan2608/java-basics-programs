package com.fingertipPrg;

public class NoOfDigits {

	public static void main(String[] args) {
   
		 int no=24954;
		 int count=0;
		 while(no!=0)
			 // or while(no>0)
		 {
			 no=no/10;
			 count++;
			 
		 }
		 System.out.println(count);
	}

}

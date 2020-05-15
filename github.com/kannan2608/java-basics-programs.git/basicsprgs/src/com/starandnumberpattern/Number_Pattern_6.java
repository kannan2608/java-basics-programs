package com.starandnumberpattern;

public class Number_Pattern_6 {

	public static void main(String[] args) {
		 for(int i=1; i<=8; i++)
		 {
			 int no=i;
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(no+" ");
				 no=no+8-j; 
			 }
			 System.out.println();
		 }
	}

}


/*

Out put

1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 


*/
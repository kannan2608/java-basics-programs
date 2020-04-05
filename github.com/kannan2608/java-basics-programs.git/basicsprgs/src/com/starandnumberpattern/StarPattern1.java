package com.starandnumberpattern;

public class StarPattern1 {

	public static void main(String[] args) {
		for (int row= 1; row<=3; row++) {
			
			//for(int col=1; col<=4; col++)
			
			for (int col =1; col<=row; col++)
				{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


/* Out Put
 
 
*
**
*** 

*/
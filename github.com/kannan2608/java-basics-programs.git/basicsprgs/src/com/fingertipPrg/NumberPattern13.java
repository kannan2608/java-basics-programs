package com.fingertipPrg;

public class NumberPattern13 {

	public static void main(String[] args) {
		for(int row=1; row<=3; row++)
		{
			for(int col=1; col<row; col++)
			{
				System.out.print("@");
			}
			for(int col1=3; col1>=row; col1--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}


/* Out Put

###
@##
@@#


  */
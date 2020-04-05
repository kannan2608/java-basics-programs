package com.fingertipPrg;

public class NumberPattern9 {

	public static void main(String[] args) {
		for(int row=1; row<=3; row++)
		{
			for(int col=3; col>=row; col--)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}


/* Out Put

321
32
3


*/
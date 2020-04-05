package com.fingertipPrg;

public class NumberPattern6 {

	public static void main(String[] args) {
			for(int row=1; row<=3; row++)
			{
				for(int col=1; col<=row; col++)
				{
					System.out.print(col);
				}
				System.out.println();
			}
		}

	}


/* Out put


1
12
123


*/
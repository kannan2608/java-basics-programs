package com.starandnumberpattern;

public class NumberPattern4 {

	public static void main(String[] args) {
		for(int row=4; row>=1; row--)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}


/* Out Put

1234
123
12
1


*/
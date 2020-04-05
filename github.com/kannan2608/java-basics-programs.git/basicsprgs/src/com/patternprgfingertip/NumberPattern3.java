package com.patternprgfingertip;

public class NumberPattern3 {

	public static void main(String[] args) {
		for(int row=3; row>=1; row--)
		{
			for(int col=3; col>=row; col--)
			{
				System.out.print(row);
			}
			System.out.println();
		}
	}

}


/* Out Put

3
22
111
*/
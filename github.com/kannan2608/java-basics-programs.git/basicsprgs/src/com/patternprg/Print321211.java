package com.patternprg;

public class Print321211 {

	public static void main(String[] args) {
		
		for(int row=3; row>=1; row--)
		{
			for(int col=row; col>=1; col--)
			{
				System.out.print(col);
			}
			System.out.println();
			}
		}
	}


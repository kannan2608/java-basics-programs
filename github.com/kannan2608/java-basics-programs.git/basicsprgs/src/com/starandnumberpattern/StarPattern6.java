package com.starandnumberpattern;

public class StarPattern6 {

	public static void main(String[] args) {
		
	for (int row = 1; row <= 7; row++) {
			for (int space = 7; space >= row; space--) {
				System.out.print(" ");
			}
				for (int col = 1; col <= row; col++) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}
}

/*
           * 
          * *
         * * *
        * * * *
       * * * * *
      * * * * * *
     * * * * * * *
 			
*/
	
		
		
		
		
		/*
	for (int row = 1; row <= 4; row++) {
			for (int col = 4; col >= row; col--) 
			{
				if (col > row)

				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
		}System.out.println();
			}
*/
	
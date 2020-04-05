package com.patternprgfingertip;

public class NumberPattern9 {

	public static void main(String[] args) {
	for(int row=1; row<=3; row++)
	{
		for(int col=1; col<row; col++)
		{
			System.out.print(" ");
		}
		for(int col1=3; col1>=row; col1--)
		{
			//System.out.print("#");
			//System.out.print(col1);
			System.out.print(row);
		}
		System.out.println();
	}


}
}



/* Out Put for System.out.print("#");
 
 ###
  ##
   #
 
  
 /
  
  Out Put for System.out.println(col1)
  
321
 32
  3
   


Out put for System.out.print(row);

111
 22
  3
*/
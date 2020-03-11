 package com.patternprgAtoZ;

public class Print3Stat3rows {

	public static void main(String[] args) {
          int row =1;
          while(row<=3)
          {
        	  for(int col=1; col<=3; col++)
        	  {
        		 //System.out.print(row);
        		 // System.out.print(col);
        		 System.out.print("*");
        	  }
        	  System.out.println();
        	  row++;
          }
	}

}

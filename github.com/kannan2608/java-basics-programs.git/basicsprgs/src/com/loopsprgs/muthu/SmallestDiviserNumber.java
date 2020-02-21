package com.loopsprgs.muthu;

public class SmallestDiviserNumber {

	public static void main(String[] args) {
		int no=100;
		int div=2;
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				break;
			
			}
			div++;
		}
	}

}

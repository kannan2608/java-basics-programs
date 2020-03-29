package com.loopsprgs.muthu;

public class FibonisSerier { // 0+1+2+3+4+5+6+7+8+9

	public static void main(String[] args) {
		int first=0,second=1;
		for(int i=0; i<=10;i++)
		{
			   int third=first+second;
			  first=second;
		second=third;
			System.out.println(second);
		}
	}
 
}


/* WITHOUT USING 3RD VARIABLE second=first+second;//int third=first+second;
first=second-first;//first=second;*/
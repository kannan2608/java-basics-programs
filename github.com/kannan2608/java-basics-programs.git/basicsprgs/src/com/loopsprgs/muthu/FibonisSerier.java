package com.loopsprgs.muthu;

public class FibonisSerier {

	public static void main(String[] args) {
		int first=0,second=1;
		for(int i=2; i<=10;i++)
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
package com.loopsprgs.muthu;

public class OddEvenBoath 
{

	public static void main(String[] args) 
	{
		int no=1;
		while(no<=10)
		{
			System.out.println(no);
			no+=2;
			if(no==11)
				no=2;
		}
	}

}

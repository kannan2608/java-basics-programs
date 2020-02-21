package com.loopsprgs.muthu;

public class Decimal2Binary {

	public static void main(String[] args) {
		int  no=4;
		String rem=" ";
		while(no>0)
		{
			rem=no%2+rem;
			no=no/2+1;
		}
		System.out.println(rem);
		}
		
	}


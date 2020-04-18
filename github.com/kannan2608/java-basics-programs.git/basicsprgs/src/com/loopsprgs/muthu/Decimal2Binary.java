package com.loopsprgs.muthu;

public class Decimal2Binary {

	public static void main(String[] args) {
		/*int  no=4;
		String rem=" ";
		while(no>0)
		{
			rem=no%2+rem;
			no=no/2+1;
		}
		System.out.println(rem);*/
	

int decimal=55;
String binary="";
while(decimal>0)
{
	int rem=decimal%2;
	binary=rem+binary;
	decimal=decimal/2;
}
System.out.println(binary);
	}

}

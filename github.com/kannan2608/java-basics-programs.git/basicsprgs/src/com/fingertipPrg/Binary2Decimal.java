package com.fingertipPrg;

public class Binary2Decimal {

	public static void main(String[] args) {
int binary=10111;
double decimal=0,i=0;
while(binary>0)
{
	int rem=binary%10;
	decimal=decimal+(rem*Math.pow(2, i));
	binary=binary/10;
	i++;
	
}
System.out.println(decimal);
	}

}
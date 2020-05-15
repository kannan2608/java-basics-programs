package com.fingertipPrgloops;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		int binary=1010;
		double decimal=0;
		int i=0;
		while(binary>0) {
		int rem=binary%10;
		decimal=decimal+(rem*Math.pow(2, i));
		binary=binary/10;
		i++;
		
		
	}
		System.out.println(decimal);
	

}}

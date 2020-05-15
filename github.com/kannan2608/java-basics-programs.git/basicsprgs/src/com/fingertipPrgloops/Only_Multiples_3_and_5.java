package com.fingertipPrgloops;

public class Only_Multiples_3_and_5 {

	public static void main(String[] args) {
		int no = 1;
		while (no <= 99) {
			if( (no % 3 == 0)&&(no%5==0)) {
				System.out.println(no);

			}
			no++;
		}
	}
}

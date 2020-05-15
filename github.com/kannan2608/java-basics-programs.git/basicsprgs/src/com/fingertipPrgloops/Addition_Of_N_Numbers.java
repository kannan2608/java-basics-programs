package com.fingertipPrgloops;

public class Addition_Of_N_Numbers// 0+1+2+3+4+5=15
{

	public static void main(String[] args) {
		int box = 0;
		int no = 1;
		while (no <= 6) {
			System.out.println(box);
			box = box + no;
			//System.out.println(box);
			no++;
			//System.out.println(box);
		}
		//System.out.println("The Addition Of first N Number is=" + box);

	}

}

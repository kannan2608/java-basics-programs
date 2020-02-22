
package com.loopsprgs.muthu;

public class Square {

	public static void main(String[] args)

	{
		int no = 81;
		int div = 2;

		while (no <= no / 2) {
			if (no / div == div) {
				System.out.println(div + "root");
				break;
 
			}
		}
		div++;
	}

}

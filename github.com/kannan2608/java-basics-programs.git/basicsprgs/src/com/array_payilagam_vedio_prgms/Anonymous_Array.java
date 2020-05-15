package com.array_payilagam_vedio_prgms;

public class Anonymous_Array {

	public static void main(String[] args) {
		Anonymous_Array.sum(new int[] { 10, 20, 30 });
	}

	static void sum(int[] no) {

		int total = 0;
		for (int i : no) {
			total = total + i;
		}
		System.out.println(total);

	}
}


/*


1. Anonoymous array is without array  name creation.

2. create and initialized in a single line

3. anonoymous it can be single and multidaimentional

4. it cal be used only onec.

5. it can be used as an argument  in method


*/
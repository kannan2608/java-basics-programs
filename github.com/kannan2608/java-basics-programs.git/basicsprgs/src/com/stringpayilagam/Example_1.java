package com.stringpayilagam;

public class Example_1 {

	public static void main(String[] args) {

		String s1 = "nothing will change unless you can change";

		char res = s1.charAt(0);
		int count = 1;
		for (int i = 1; i <= s1.length() - 1; i++) {
			if (res == s1.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

}

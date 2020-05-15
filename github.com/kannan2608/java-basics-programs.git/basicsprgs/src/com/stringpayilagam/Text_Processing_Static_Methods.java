package com.stringpayilagam;

public class Text_Processing_Static_Methods {

	public static void main(String[] args) {

		String s = "payilagam chennai tamil Nadu";

		// 1. matches
		System.out.println(s.matches("\\w{9}"));

		// 2.replace char and repalce String

		System.out.println(s.replace('a', 'x'));

		System.out.println(s.replace("payilagam", "chennai"));

		// 3. replaceall

		System.out.println(s.replaceAll("\\s", "#"));

		// 4.replace first not working my software

		System.out.println(s.replaceFirst("//s", "k"));

		// 5.split

		String[] s2 = s.split(" ");
		for (String ss : s2) {
			System.out.println(ss);
		}

		System.out.println(s2.length);

		String[] s3 = s.split(" ", 3);
		{
			for (String ss : s3) {
				System.out.println(ss);
			}
		}

		// 6. join

		System.out.println(String.join("--", "26", "01", "1995"));

		// 7. value of
		int no1 = 5;

		String a = String.valueOf(no1);
		System.out.println(a);
		System.out.println(no1 + 5);
		System.out.println(a + 5);

		System.out.println((s.contains("tamil")));
	}

}

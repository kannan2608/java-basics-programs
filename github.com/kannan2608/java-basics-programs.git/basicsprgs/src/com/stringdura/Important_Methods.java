package com.stringdura;

public class Important_Methods {

	public static void main(String[] args) {

		// 1. public boolean is Empty()
		String s = "";
		System.out.println(s.isEmpty());
		String s1 = " ";
		System.out.println(s1.isEmpty());

		// 2. publi int length()

		String s2 = "kannan";
		System.out.println(s2.length());
		// System.out.println(s2.length); only applicable for arry variable

		int[] x = { 10, 20, 30, 40, 50, 60 };
		System.out.println(x.length);
		// System.out.println(x.length()); error will throw

		// 3. public string replace(char old,char new)

		String s3 = "abababab";
		System.out.println(s3.replace('a', 'b'));

		// 4 public string substring(int begin)

		String s4 = "Master of computer science";
		System.out.println(s4.substring(4));
		System.out.println(s4.substring(4, 15));

		String s5 = "kannan";
		System.out.println(s5.indexOf('n'));
		System.out.println(s5.indexOf('b'));

		String s6 = "Python kannan";
		System.out.println(s6.lastIndexOf("n"));

		String s7 = "kNnan";

		System.out.println(s7.toUpperCase());
		System.out.println(s7.toLowerCase());
	}

}

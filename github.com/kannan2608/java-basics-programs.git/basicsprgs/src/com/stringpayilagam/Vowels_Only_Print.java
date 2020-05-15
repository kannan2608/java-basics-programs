package com.stringpayilagam;

public class Vowels_Only_Print {

	public static void main(String[] args) {
		String word = "education";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(ch + " ");

			}
		}

	}

}

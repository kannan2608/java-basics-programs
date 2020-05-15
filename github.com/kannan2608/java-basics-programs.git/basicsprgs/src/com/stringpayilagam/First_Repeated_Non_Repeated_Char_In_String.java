package com.stringpayilagam;

public class First_Repeated_Non_Repeated_Char_In_String {

	public static void main(String[] args) {
		/*
		 * String word = "kannan karthi ";
		 * 
		 * char res = word.charAt(0); boolean repeat = false;
		 * 
		 * for (int i = 1; i < word.length(); i++) { if (res == word.charAt(i)) {
		 * System.out.println(res + "repeated"); repeat = true;
		 * 
		 * break; } }
		 * 
		 * if (repeat == false) { System.out.println(res + "not repeated"); }
		 * 
		 */

		// 2. first non repeated character

		String sd = "windos";
		boolean repeat = false;

		for (int i = 0; i < sd.length(); i++) {
			char ch = sd.charAt(i);

			for (int j = i + 1; j < sd.length(); j++) {
				if (ch == sd.charAt(j)) {
					//System.out.println(ch + "repeated");
					repeat = true;

					break;
				}
			}

			if (repeat == false) {
				System.out.println(ch + "   not repeated");
				break;
			}

		}

	}

}

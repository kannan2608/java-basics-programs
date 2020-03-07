package com.stringmuthu;

public class CapitalLettertoSmall {

	public static void main(String[] args) {
		/*
		 * char[] alpha= {'A','B','C','D'}; int i=0; while(i<alpha.length) { char
		 * ch3=alpha[i]; int ch33=(int)ch3+32; System.out.println((char)ch33); i++;
		 */

		char[] alpha = { 'a', 'b', 'c', 'd' };
		int i = 0;
		while (i < alpha.length) {
			char ch3 = alpha[i];
			int ch33 = (int) ch3 - 32;
			System.out.println((char) ch33);
			i++;

			/*
			 * String s="abcd"; char[] alpha1 =s.toCharArray(); System.out.println(alpha);
			 * 
			 * 
			 */

		}

	}
}

package com.stringmuthu;

public class MobileNumberRNot {

	public static void main(String[] args) {
		String s = "90515";
		char[] ch = s.toCharArray();
		boolean flag = true;
		if ((ch.length == 10) && (ch[0] != 0)) {
			for (int i = 0; i < ch.length; i++) {
				char c = ch[i];
				int asc = (int) c;
				if (!((asc >= 48) && (asc <= 57))) {
					System.out.println("not a monbile number");
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println("valid mobile number");
			} 
		}
		else {

				System.out.println("enter the current mobile number");
			}
		}
	}

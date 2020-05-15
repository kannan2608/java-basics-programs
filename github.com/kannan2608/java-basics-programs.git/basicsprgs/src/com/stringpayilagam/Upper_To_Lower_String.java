package com.stringpayilagam;

public class Upper_To_Lower_String {

	public static void main(String[] args) {

		String s = "happay";

		// first later only cpa chage

		char[] ch = s.toCharArray();

		//ch[0] = (char) (ch[0] - 32);

		// s=new String(ch);
		// System.out.println(s); //Kannan

		// 2. out put like kAnNaN ont

		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0)
				ch[i] = (char) (ch[i] - 32);
		}

		s = new String(ch);
		System.out.println(s);
		
		
		// 3. using substring
		
		
		String s2="CHENNAI";
		 //System.out.print(s2.substring(0,1).toUpperCase()+s.substring(1));
		 
		 for(int i=0; i<s2.length(); i++)
		 {
			 if(i%2==0)
				 System.out.print(s2.substring(i,i+1).toUpperCase());
			 else
			  System.out.print(s2.substring(i,i+1).toLowerCase());
				 
		 }

	}

}

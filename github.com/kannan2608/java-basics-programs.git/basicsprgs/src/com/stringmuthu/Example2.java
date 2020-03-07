package com.stringmuthu;

public class Example2 {

	public static void main(String[] args) {
		
		// even  and even character  print
		String name="abcdefghi";
		char[] alpha=name.toCharArray();
		int i=0;
		//int i=1;
		while(i<alpha.length)
		{
			char ch=alpha[i];
			if(i%2==0)
			{
			int ch1=(int)ch-32;
			System.out.println((char)ch1);
			}
			else {
				int ch2=(int)ch;
		
			System.out.println((char)ch2);
			}
			i++;
	}

}
}


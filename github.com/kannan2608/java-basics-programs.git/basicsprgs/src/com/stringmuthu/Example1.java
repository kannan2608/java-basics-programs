package com.stringmuthu;

public class Example1 {

	public static void main(String[] args) {

		String[] name= {"kannan","eswari","Abdul","ovia"};
		int i=0;
		int count=0;		while(i<name.length){
			char[] na=name[i].toCharArray();
			char f=na[0];
		//char l=na[name.length]
			//char l=na[i];
		
			switch (f)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;
			}
			i++;
			
		}
		
		System.out.println(name[i]);
	}

}

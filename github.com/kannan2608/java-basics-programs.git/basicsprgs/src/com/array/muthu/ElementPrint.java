package com.array.muthu;

public class ElementPrint {

	public static void main(String[] args) {
		int[] kannan= {5,10,45,55,55};
		for(int i=0; i<kannan.length; i++)
		{
			if(kannan[i]==45)
			{
				System.out.println("45 is present at"+ i);
				break;
		}
		
		}for(int i=0; i<kannan.length; i++)
		{
			if(i==3)
			{
				System.out.println(kannan[i]);
			}
		}
	}

}

package com.oops;

public class NestedIfelse {

	public static void main(String[] args) {
		int a=1,b=10,c=12;
		if(a>b)
		{
			System.out.println(a );
			
		}
		else if(c>a)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(a+""+c);
		}
		if(b>a)
		{
			if(b>c)
			{
				System.out.println(b);
			}
			else if(c>b) {
				System.out.println(c);
				
		}
			else
			{
				System.out.println();
			}
				
		}
			
			
		
	}

}

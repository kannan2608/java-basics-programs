package com.stringpayilagam;

public class Alphabet_Number_Count_In_String {

	public static void main(String[] args) {

		String s = "channai 600123";

		// 1. numbers only print method 1

		/*
		 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) >= '0') if
		 * (s.charAt(i) <= '9') { System.out.print(s.charAt(i)+" "); } }
		 */

		// 2. number only print method 2 repalyall using regx

		// System.out.println(s.replaceAll("[a-zA-Z]",""));

		// 3. onlu alphabet print

		/*for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a')
				if (s.charAt(i) <= 'z') {
					System.out.print(s.charAt(i) + " ");
				} else if (s.charAt(i) >= 'A')
					if (s.charAt(i) <= 'Z')
						System.out.println(s.charAt(i));

		         }
*/
		// 4. method 2 only alphabet 
		
		System.out.println(s.replaceAll("[0-9]", ""));
		
		// 5. only number preset r not method 1
		
	
		String name="  kanna";
	/*	int nocount=0;
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)>='0')
				if(name.charAt(i)<='9')
					nocount++;
					
		}
		if(nocount==name.length())
			System.out.println("All are numbers in the given string");
		else
			System.out.println("No someother character are present");
		//System.out.println(nocount);
		*/
		
		// 6. only number preset r not method 2
		
	/*	
		String res=name.replaceAll("[a-zA-Z]", "");
		
		if(name.length()==res.length())
			System.out.println("only numbers");
		else
			System.out.println("number and char mixed");
		*/
		
		
		// 6. only alphabe preset r not method 1
		
		/*
				String res1=name.replaceAll("[0-9]", "");
				
				if(name.length()==res1.length())
					System.out.println("only character present");
				else
					System.out.println("number and char mixed");
				*/
				
		//7. count in the number given string	
				
			/*	String state=" trichy 600458";
				int count=0;
				for(int i=0; i<state.length(); i++)
				{
					if(state.charAt(i)>='0')
						if(state.charAt(i)<='9')
							count++;

				}
				System.out.println(count);
				*/
		
		
		//8. count how may char in string
				
				
				String state1=" trichy  0123466 chennai ";
				int count=0;
				for(int i=0; i<state1.length(); i++)
				{
					if(state1.charAt(i)>='a')
						if(state1.charAt(i)<='z')
							count++;

				}
				System.out.println(count);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

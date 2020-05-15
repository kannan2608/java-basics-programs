package com.fingertipPrgloops;

public class String_Examples {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2="java";
	// Scnoira2  String s2=s1; boatha are heap memory
		
		// Scnoria 3 s2="java";
		//s1="Python";
	//	s2="Python";
		
		s1=new String("Python");
		s2=new String("Python");
		String s3=new String(s1);
		
		if(s3==s2)
		{
			System.out.println("==");
			
		}
		else
		System.out.println("not ===");
		if(s1.equals(s2))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

}

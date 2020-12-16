package com.stringdura;

public class Heap_Constant_Pool {

	public static void main(String[] args) {


		/*
		String s1=new String("kannan");
		String s2=new String("kannan");
		String s3="kannan";
		String s4="kannan";
		*/
		// in this example total 3 object only created
		
		//heap are 2 object in heap and one objet in scp 

		
		
		String s= new String("java");
		s.concat("Softward Enginnering");
		s=s.concat("full stack developer");
		System.out.println(s);
		
		/* in this case oj example total 6 object will created heap 3 scp 3 object*/
		
	}

}

package com.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class GenericsExamples {

	public static void main(String[] args) {
		
		
		HashSet<String> Name=new HashSet<String>();
		Name.add("kannan");
		Name.add("karthi");
		Name.add("babu");
		Name.add("kannan");
		Name.add("ashok");
		//System.out.println(Name);
		for(Object res: Name)
		{
			System.out.println(res);
		}
		
	
		TreeSet<Float> Ages=new TreeSet<Float>();
		Ages.add(15.5f);
		Ages.add(55.5f);
		Ages.add(15.5f);
		Ages.add(355.5f);
		Ages.add(15.10f);
		Ages.add(97.50f);
		Ages.add(15.5f);
		
		for(Object res4:Ages)
			System.out.println(res4);
		
		
		
	}
	

}

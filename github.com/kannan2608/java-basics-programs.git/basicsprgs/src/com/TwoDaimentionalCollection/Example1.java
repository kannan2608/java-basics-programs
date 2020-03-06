package com.TwoDaimentionalCollection;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {
		TreeMap<String,Boolean>VoterList=new TreeMap<String,Boolean>();
		
		VoterList.put("kannan",true);
		VoterList.put("mani",false);
		VoterList.put("karthi",true);
		VoterList.put("mohan",false);
		VoterList.put("kannan",true);
		VoterList.put("inba",true); 
		VoterList.put("praba",false);
		VoterList.put("Naresh",true);
		VoterList.put("ranjth", false);
		
		
		
		
		for(Map.Entry vote:VoterList.entrySet())
			if(vote.getValue().equals(false))
			{
			System.out.println(vote.getKey());
			
			}

	}

}

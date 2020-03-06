package com.TwoDaimentionalCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TwoDaimentionalExample {

	
	public static void main(String[] args) {
		
		
		TreeMap<String,String> iAttendees=new TreeMap<String,String>();
		iAttendees.put("Z877t","Ajay");
		iAttendees.put("J98dk","Jaghul");
		iAttendees.put("87gh6","abi");
		iAttendees.put("hdf497d","kannan");
		iAttendees.put("kj4857k","mohan");
		iAttendees.put("98dkhf","ashivini");
		iAttendees.put("kdjd83kd","eswari");
		iAttendees.put("A877t","vijay");
		
		
			//System.out.println(iAttendees);
		for(Map.Entry names:iAttendees.entrySet())
		{
			System.out.print(names.getKey()+"=>"+names.getValue());
		}
			
			
		
			HashMap<String,String> iAttendees1=new HashMap<String,String>();
			iAttendees1.put("Z877t","Ajay");
			iAttendees1.put("J98dk","Jaghul");
			iAttendees1.put("87gh6","abi");
			iAttendees1.put("hdf497d","kannan");
			iAttendees1.put("kj4857k","mohan");
			iAttendees1.put("98dkhf","ashivini");
			iAttendees1.put("kdjd83kd","eswari");
			iAttendees1.put("A877t","vijay");
			
			for(Map.Entry names:iAttendees1.entrySet())
			{
				System.out.print(names.getKey()+"=>"+names.getValue());
			}
			
			//System.out.println(iAttendees1);
			
			
			LinkedHashMap<String,String> iAttendees2=new LinkedHashMap<String,String>();
			iAttendees2.put("Z877t","Ajay");
			iAttendees2.put("J98dk","Jaghul");
			iAttendees2.put("87gh6","abi");
			iAttendees2.put("hdf497d","kannan");
			iAttendees2.put("kj4857k","mohan");
			iAttendees2.put("98dkhf","ashivini");
			iAttendees2.put("kdjd83kd","eswari");
			iAttendees2.put("A877t","vijay");
			
			//System.out.println(iAttendees2);
		
			for(Map.Entry names:iAttendees2.entrySet())
			{
				System.out.print(names.getKey()+"=>"+names.getValue());
			}
		
		
		
		
	}

}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList room1=new ArrayList();
		room1.add("kannan");
		room1.add("karthi");
		room1.add("Babu");
		room1.add("Dinesh");
	
		//System.out.println(room1);
		
		ArrayList room2=new ArrayList();
		room2.add("Anbu");
		room2.add("Raja");
		room2.add("karthi");
		//System.out.println(room2);
		
		
		
     ArrayList Payilagam=new ArrayList();
     Payilagam.addAll(room1);
    
     Payilagam.addAll(room2);
     System.out.println(Payilagam);
		
		
		
	}

}

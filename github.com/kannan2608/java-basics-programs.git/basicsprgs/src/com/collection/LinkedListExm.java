package com.collection;

import java.util.LinkedList;

public class LinkedListExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    LinkedList<String> obj=new LinkedList<String>();
	    obj.add("kannan");
		obj.add("karthi");
		obj.add("Babu");
		obj.add("Dinesh");
		obj.add("krishna");
		//System.out.println(obj);
		
		
		obj.add(2,"123");
		System.out.println(obj);
		
		obj.add("mca");
		System.out.println(obj);
		
		
		LinkedList<String> obj1=new LinkedList();
		obj1.add("pschoco");
		obj1.addAll(obj);
		System.out.println(obj1);
		
		
		//obj.addFirst("wwe");
		//System.out.println(obj);
		
		obj.addLast("wwf");
		System.out.println(obj);
		
		//obj.clear();
		//System.out.println(obj);
		
		obj.clone();
		System.out.println(obj);
		

		   System.out.println( obj.contains("java"));
	   
	   obj.get(5);
	   System.out.println(obj);
	   
	    
	   System.out.println(obj.get(2));
	   
	   System.out.println(obj.getFirst());
		
	   System.out.println(obj.getLast());
	   
	   System.out.println(obj.indexOf("wwf"));
		
	   
	   System.out.println( obj.lastIndexOf("wwf"));
	   
	   System.out.println( obj.remove(3));
	   
	   System.out.println(  obj.remove("kannan"));
	   System.out.println(obj);

	   
	   System.out.println( obj.removeFirst());
	   
	   System.out.println( obj.removeLast());
	   
	   System.out.println(obj);
	   
	   
	   System.out.println( obj.set(1, "Android"));
	   System.out.println(obj);



	   System.out.println(obj.size());
		
		
		int res5=obj.size();
		System.out.println(obj.size());

		
		
	   
	}

}

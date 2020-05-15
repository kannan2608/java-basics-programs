package com.garbage_collection;

public class GarbageCollectionDemo {
	
	
	

	public static void main(String[] args) {
		
		
		// when an object is ready for garbage collection
		
		//1. Nullying an object
		//2. reassigning  reference variable
		
		GarbageCollectionDemo GCD1= new GarbageCollectionDemo();
		GarbageCollectionDemo GCD2= new GarbageCollectionDemo();
		GarbageCollectionDemo GCD3= new GarbageCollectionDemo();
		
		GCD1=null;
		GCD2=GCD1;
		
		System.out.println(GCD1);
		System.out.println(GCD2);
		System.out.println(GCD3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

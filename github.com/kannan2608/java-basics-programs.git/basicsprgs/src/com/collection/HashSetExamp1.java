package com.collection;
import java.util.*;
public class HashSetExamp1 {

	public static void main(String[] args) {
	
		
		HashSet fruite=new HashSet();
		
		fruite.add("apple");
		fruite.add("banana");
		fruite.add("Goya");
		fruite.add("apple");
		fruite.add("madulai");
		fruite.add("grapes");
		fruite.add("banana");
		
		/*  Iterator i=fruite.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  */
       /*  for(Object res:fruite)
         {
        	 System.out.println(res);
         }
         
         
         
         LinkedHashSet Bike=new LinkedHashSet();
         Bike.add("yahmaha");
         Bike.add("pulser");
         Bike.add("R15");
         Bike.add("Bajaj");
         Bike.add("Reyoal Enfiled");
         Bike.add("Yahmaha");
         
         for(Object res2:Bike)
        	 System.out.println(res2);*/
         
         
         
         
         
         
         TreeSet State=new TreeSet();
         State.add("TamilNadu");
         
         State.add("Bangaulr");
         State.add("Haryana"); 
         State.add("Delhi");
         State.add("Andthra");
         State.add("punjabi");
         State.add("TamilNadu");
         
         
         for(Object res3:State)
        	 System.out.println(res3);
         
   //      TreeSet res4 = (TreeSet<Object>)TreeSet.descendingSet();
         
   
         
         
         
	}

}

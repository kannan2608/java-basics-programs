package com.collection;
import java.util.*;
public class HashsetExample {

	public static void main(String[] args) {
		HashSet obj2=new HashSet();
		
		obj2.add(1);
		obj2.add(2);
		obj2.add(3);
		obj2.add(4);
		obj2.add(5);
		obj2.add(6);
		obj2.add(7);
		
		System.out.println(obj2);
		
		
		  Iterator i=obj2.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
		
          
          
          HashSet set=new HashSet();  
          set.add("Ravi");  
          set.add("Vijay");  
          set.add("Ravi");  
          set.add("Ajay");  
          set.add("Vijay");
          
          
          Iterator itr=set.iterator();  
          while(itr.hasNext()){  
           System.out.println(itr.next());  
          
           
           boolean res1=set.remove("Vijay");
           System.out.println(res1);
           
           
          set.clear();
           System.out.println(set);
           
           
           
           
		
		
	}

}
}
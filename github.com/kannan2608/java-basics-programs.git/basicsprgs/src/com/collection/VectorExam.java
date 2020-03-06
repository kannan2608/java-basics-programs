package com.collection;

import java.util.*;

public class VectorExam {

	public static void main(String[] args) {

		Vector vec = new Vector(4);

		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");

		System.out.println("Size is: " + vec.size());
		System.out.println("Default capacity is: " + vec.capacity());

		System.out.println("Vector element is: " + vec);

		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");

		System.out.println("Size after addition: " + vec.size());
		System.out.println("Capacity after addition is: " + vec.capacity());

		System.out.println("Elements are: " + vec);
		
		
		 if(vec.contains("Triger"))  
         {  
            System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
         }  
         else  
         {  
            System.out.println("Tiger is not present in the list.");  
         }  
          
       System.out.println("The first animal of the vector is = "+vec.firstElement());  
       
       
       
       Vector  in = new Vector ();  

       in.add(100);  
       in.add(200);  
       in.add(300);  
       in.add(200);  
       in.add(400);  
       in.add(500);  
       in.add(600);  
       in.add(700); 
       
       
       System.out.println("Values in vector: " +in);  
       
       System.out.println("Remove first occourence of element 200: "+in.remove((Integer)200));  
       System.out.println("Values in vector: " +in); 
       
       
       System.out.println("Remove element at index 4: " +in.remove(4));  
       System.out.println("New Value list in vector: " +in);  
       
       in.removeElementAt(5);        
       System.out.println("Vector element after removal: " +in);
       
       
       System.out.println("Hash code of this vector = "+in.hashCode());  
       System.out.println("Element at index 1 is = "+in.get(1));  
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}
	
	

}

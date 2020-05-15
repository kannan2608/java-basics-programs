package com.array_payilagam_vedio_prgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_Duplicate_Elements_In_Array_Method_3 {

	public static void main(String[] args) {
		// Using HashTable
		
		
		 int[] a= {1,2,3,1,3,1,4,1,2,2,22,22,2,1,3};
		 
		 Map<Integer,Integer> hm=new HashMap<>();
		 
		 for(int no:a)
		 {
			 Integer count=hm.get(no);
			 if(count==null)
			 {
				 hm.put(no,1);
			 }
			 else
			 {
				 count++;
				 hm.put(no, count);
			 }
		 }
		 System.out.println("Duplicate elements are");
		 Set<Map.Entry<Integer,Integer>>es=hm.entrySet();
		 for(Map.Entry<Integer,Integer>me:es)
		 {
			 if(me.getValue()>1)
			 {
				 System.out.print(me.getKey()+" ");
			 }
		 }
	}

}

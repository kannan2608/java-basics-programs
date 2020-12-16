
package com.stringdura;

public class Heap_Scp_Example_2 {

	public static void main(String[] args) {
		
		String s1=new String("Spring");
		s1.concat("Fall");
		String s2=s1.concat("Winter");
		s2.concat("Summer");
		System.out.println(s1);
		System.out.println(s2);
		
		
		/* Total 8 object will be created heap 4 sjp 4   heap 2 object elegible for carbage collection  */
	}

}
